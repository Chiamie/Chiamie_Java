package services;

import data.models.Officer;
import data.models.Vehicle;
import data.repositories.*;
import dtos.requests.BookTicketRequest;
import dtos.requests.SettleTicketRequest;
import dtos.requests.ViewTicketRequest;
import dtos.responses.SettleTicketResponse;
import dtos.responses.ViewTicketResponse;
import exceptions.InvalidIdException;
import exceptions.InvalidOffenceException;
import exceptions.InvalidOfficerEmailException;
import exceptions.VehicleNotExistException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketServiceImplTest {
    private TicketService ticketService;
    private OfficerRepository officerRepository;
    private TicketRepository ticketRepository;
    private VehicleRepository vehicleRepository;

    @BeforeEach
    void setUp() {
        officerRepository = new Officers();
        vehicleRepository = new Vehicles();
        ticketRepository = new Tickets();
        ticketService = new TicketServiceImpl(ticketRepository, officerRepository, vehicleRepository);
        officerRepository.deleteAll();
        vehicleRepository.deleteAll();
        ticketRepository.deleteAll();
    }

    @Test
    void registerOfficer_registerVehicle_bookTicketCountIsOne() {
        Officer savedOfficer = new Officer();
        savedOfficer.setOfficerEmail("feyi@gmail.com");
        officerRepository.save(savedOfficer);

        Vehicle savedVehicleOne = new Vehicle();
        vehicleRepository.save(savedVehicleOne);

        BookTicketRequest bookTicketRequest = new BookTicketRequest();
        bookTicketRequest.setVehicleId(savedVehicleOne.getId());
        bookTicketRequest.setOfficerEmail(savedOfficer.getOfficerEmail());

        bookTicketRequest.setOffence("One_Way");
        ticketService.bookTicket(bookTicketRequest);
        assertEquals(1, ticketRepository.count());

    }

    @Test
    void bookTicket_withWrongVehicleId_throwsVehicleNotExistException() {
        BookTicketRequest bookTicketRequest = new BookTicketRequest();
        bookTicketRequest.setVehicleId(2);

        bookTicketRequest.setOffence("One_Way");

        assertThrows(VehicleNotExistException.class, () -> ticketService.bookTicket(bookTicketRequest));
        assertEquals(0, ticketRepository.count());
    }

    @Test
    void bookTicket_withWrongOfficerEmail_throwsOfficerNotExistException() {
        Officer savedOfficer = new Officer();
        savedOfficer.setOfficerEmail("feyi@gmail.com");
        officerRepository.save(savedOfficer);

        Vehicle savedVehicleOne = new Vehicle();
        vehicleRepository.save(savedVehicleOne);

        BookTicketRequest bookTicketRequest = new BookTicketRequest();
        bookTicketRequest.setVehicleId(savedVehicleOne.getId());
        bookTicketRequest.setOfficerEmail("chiamie@gmail.com");
        bookTicketRequest.setOffence("One_Way");

        assertThrows(InvalidOfficerEmailException.class, () -> ticketService.bookTicket(bookTicketRequest));
        assertEquals(0, ticketRepository.count());
    }




    @Test
    void bookTicket_withWrongOffence_throwsOffenceNotExistException() {
        Officer savedOfficer = new Officer();
        savedOfficer.setOfficerEmail("feyi@gmail.com");
        officerRepository.save(savedOfficer);

        Vehicle savedVehicleOne = new Vehicle();
        vehicleRepository.save(savedVehicleOne);

        BookTicketRequest bookTicketRequest = new BookTicketRequest();
        bookTicketRequest.setVehicleId(savedVehicleOne.getId());
        bookTicketRequest.setOfficerEmail(savedOfficer.getOfficerEmail());
        bookTicketRequest.setOffence("Two_Way");

        assertThrows(InvalidOffenceException.class, ()->ticketService.bookTicket(bookTicketRequest));
    }


    @Test
    void viewTicket() {
        Officer savedOfficer = new Officer();
        savedOfficer.setOfficerEmail("feyi@gmail.com");
        officerRepository.save(savedOfficer);

        Vehicle savedVehicleOne = new Vehicle();
        vehicleRepository.save(savedVehicleOne);

        BookTicketRequest bookTicketRequest = new BookTicketRequest();
        bookTicketRequest.setVehicleId(savedVehicleOne.getId());
        bookTicketRequest.setOfficerEmail(savedOfficer.getOfficerEmail());

        bookTicketRequest.setOffence("One_Way");
        ticketService.bookTicket(bookTicketRequest);
        assertEquals(1, ticketRepository.count());

        ViewTicketResponse viewTicketResponse = new ViewTicketResponse();
        ViewTicketRequest viewTicketRequest = new ViewTicketRequest();
        viewTicketRequest.setVehicleId(1);
        viewTicketResponse.setTickets(savedVehicleOne.getTickets());
//        System.out.println(viewTicketResponse);
//        System.out.println(ticketService.viewTicket(viewTicketRequest));


        assertEquals(viewTicketResponse, ticketService.viewTicket(viewTicketRequest));
    }

    @Test
    void registerOfficerAndVehicle_bookTicket_viewTickeWithWrongVehicleId_throwsVehicleNotExistException() {
        Officer savedOfficer = new Officer();
        savedOfficer.setOfficerEmail("feyi@gmail.com");
        officerRepository.save(savedOfficer);

        Vehicle savedVehicleOne = new Vehicle();
        vehicleRepository.save(savedVehicleOne);

        BookTicketRequest bookTicketRequest = new BookTicketRequest();
        bookTicketRequest.setVehicleId(savedVehicleOne.getId());
        bookTicketRequest.setOfficerEmail(savedOfficer.getOfficerEmail());
        bookTicketRequest.setOffence("One_Way");
        ticketService.bookTicket(bookTicketRequest);

        assertEquals(1, ticketRepository.count());

        ViewTicketResponse viewTicketResponse = new ViewTicketResponse();
        ViewTicketRequest viewTicketRequest = new ViewTicketRequest();
        viewTicketRequest.setVehicleId(2);
        viewTicketResponse.setTickets(savedVehicleOne.getTickets());

        assertThrows(VehicleNotExistException.class, ()->ticketService.viewTicket(viewTicketRequest));
    }

    @Test
    void registerVehicleAndOfficer_bookTicket_settleTicket() {
        Vehicle savedVehicleOne = new Vehicle();
        vehicleRepository.save(savedVehicleOne);

        Officer savedOfficer = new Officer();
        savedOfficer.setOfficerEmail("feyi@gmail.com");
        officerRepository.save(savedOfficer);

        BookTicketRequest bookTicketRequest = new BookTicketRequest();
        bookTicketRequest.setVehicleId(savedVehicleOne.getId());
        bookTicketRequest.setOfficerEmail(savedOfficer.getOfficerEmail());
        bookTicketRequest.setOffence("One_Way");
        ticketService.bookTicket(bookTicketRequest);



        assertEquals(1, ticketRepository.count());

        SettleTicketRequest settleTicketRequest = new SettleTicketRequest();
        settleTicketRequest.setVehicleId(savedVehicleOne.getId());
        settleTicketRequest.setTicketId(1);
        settleTicketRequest.setPaymentTeller(5000);
        ticketService.settleTicket(settleTicketRequest);

        assertTrue(ticketRepository.findByTicketNumber(1).isHasPaid());
        assertTrue(savedVehicleOne.getTickets().get(0).isHasPaid());
        assertTrue(vehicleRepository.findById(1).getTickets().get(0).isHasPaid());
    }

    @Test
    void registerVehicleAndOfficer_bookTicketForTwoOffences_settleTicketForOffenceTwo() {
        Vehicle savedVehicleOne = new Vehicle();
        vehicleRepository.save(savedVehicleOne);

        Officer savedOfficer = new Officer();
        savedOfficer.setOfficerEmail("feyi@gmail.com");
        officerRepository.save(savedOfficer);

        BookTicketRequest bookTicketRequest = new BookTicketRequest();
        bookTicketRequest.setVehicleId(savedVehicleOne.getId());
        bookTicketRequest.setOfficerEmail(savedOfficer.getOfficerEmail());
        bookTicketRequest.setOffence("One_Way");
        ticketService.bookTicket(bookTicketRequest);
        assertEquals(1, ticketRepository.count());

        bookTicketRequest.setVehicleId(savedVehicleOne.getId());
        bookTicketRequest.setOfficerEmail(savedOfficer.getOfficerEmail());
        bookTicketRequest.setOffence("Over_speeding");
        ticketService.bookTicket(bookTicketRequest);

        assertEquals(2, ticketRepository.count());

        SettleTicketRequest settleTicketRequest = new SettleTicketRequest();
        settleTicketRequest.setVehicleId(savedVehicleOne.getId());
        settleTicketRequest.setTicketId(2);
        settleTicketRequest.setPaymentTeller(300_000);

        ticketService.settleTicket(settleTicketRequest);

        assertTrue(ticketRepository.findByTicketNumber(2).isHasPaid());
        assertTrue(savedVehicleOne.getTickets().get(1).isHasPaid());
        assertTrue(vehicleRepository.findById(1).getTickets().get(1).isHasPaid());

    }
}