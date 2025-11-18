package services;

import data.models.Offence;
import data.models.Officer;
import data.models.Ticket;
import data.models.Vehicle;
import data.repositories.*;
import dtos.requests.BookTicketRequest;
import dtos.requests.SettleTicketRequest;
import dtos.requests.ViewTicketRequest;
import dtos.responses.BookTicketResponse;
import dtos.responses.SettleTicketResponse;
import dtos.responses.ViewTicketResponse;
import exceptions.*;

import java.time.LocalDateTime;

public class TicketServiceImpl implements TicketService {
    private VehicleRepository vehicles;
    private OfficerRepository officers;
    private TicketRepository tickets;

    public TicketServiceImpl(TicketRepository tickets, OfficerRepository officers, VehicleRepository vehicles) {
        this.tickets = tickets;
        this.officers = officers;
        this.vehicles = vehicles;
    }


    @Override
    public BookTicketResponse bookTicket(BookTicketRequest bookTicketRequest) {
        Vehicle vehicle = validateVehicleIn(bookTicketRequest);
        Officer officer = validateOfficerIn(bookTicketRequest);
        Ticket ticket = new Ticket();
        ticket.setVehicle(vehicle);
        ticket.setIssuer(officer);

        validateOffenceType(bookTicketRequest, ticket);
        Ticket savedTicket = tickets.save(ticket);
        vehicle.getTickets().add(savedTicket);
        vehicles.save(vehicle);


        return new BookTicketResponse();
    }

    private Officer validateOfficerIn(BookTicketRequest bookTicketRequest) {
        Officer officer = officers.findByEmail(bookTicketRequest.getOfficerEmail());
        if (officer == null) {
            throw new InvalidOfficerEmailException("Officer with " + bookTicketRequest.getOfficerEmail() + " not found");
        }
        return officer;
    }

    private Vehicle validateVehicleIn(BookTicketRequest bookTicketRequest) {
        Vehicle vehicle = vehicles.findById(bookTicketRequest.getVehicleId());
        if (vehicle == null) {
            throw new VehicleNotExistException("Vehicle Not Found");
        }
        return vehicle;
    }


    private void validateOffenceType(BookTicketRequest bookTicketRequest, Ticket ticket) {
        try {
            ticket.setOffence(Offence.valueOf(bookTicketRequest.getOffence().toUpperCase()));
        }catch (IllegalArgumentException e) {
            throw new InvalidOffenceException("Invalid offence type: " + bookTicketRequest.getOffence());
        }
    }

    @Override
    public ViewTicketResponse viewTicket(ViewTicketRequest viewTicketRequest){
        ViewTicketResponse viewTicketResponse = new ViewTicketResponse();
        Vehicle vehicle = validateVehicleIn(viewTicketRequest);
        viewTicketResponse.setTickets(vehicle.getTickets());
        return viewTicketResponse;
    }




    private Vehicle validateVehicleIn(ViewTicketRequest viewTicketRequest) {
        Vehicle vehicle = vehicles.findById(viewTicketRequest.getVehicleId());
        if (vehicle == null) {
            throw new VehicleNotExistException("Vehicle with " + viewTicketRequest.getVehicleId() + "  not found");
        }
        return vehicle;
    }

    @Override
    public SettleTicketResponse settleTicket(SettleTicketRequest settleTicketRequest){
        Vehicle vehicle = validateVehicle(settleTicketRequest);
        Ticket ticket = validateTicket(settleTicketRequest);
        validateTicketPayment(settleTicketRequest);
        validateOffenceAmount(settleTicketRequest, ticket);

        ticket.setHasPaid(true);
        ticket.setDateOfPayment(LocalDateTime.now());
        tickets.save(ticket);


        vehicles.save(vehicle);
        return new SettleTicketResponse();
    }

    private static void validateOffenceAmount(SettleTicketRequest settleTicketRequest, Ticket ticket) {
        if(ticket.getOffence().getAmount() != settleTicketRequest.getPaymentTeller()){
            throw new InvalidAmountException("Invalid settle ticket amount");
        }
    }

    private Ticket validateTicket(SettleTicketRequest settleTicketRequest) {
        Ticket ticket = tickets.findByTicketNumber(settleTicketRequest.getTicketId());
        if (ticket == null) {
            throw new InvalidTicketException("Ticket with " + settleTicketRequest.getTicketId() + "  not found");
        }
        return ticket;
    }

    private void validateTicketPayment(SettleTicketRequest settleTicketRequest) {
        Ticket ticket = tickets.findByTicketNumber(settleTicketRequest.getTicketId());
        if(ticket.isHasPaid())
            throw new IllegalStateException("Ticket has already been paid");
    }

    private Vehicle validateVehicle(SettleTicketRequest settleTicketRequest) {
        Vehicle vehicle = vehicles.findById(settleTicketRequest.getVehicleId());
        if (vehicle == null) {
            throw new VehicleNotExistException("Vehicle with " + settleTicketRequest.getVehicleId() + "  not found");
        }
        return vehicle;
    }




}
