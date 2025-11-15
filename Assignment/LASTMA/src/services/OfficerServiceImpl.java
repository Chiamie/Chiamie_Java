package services;

import data.models.*;
import data.repositories.*;
import dtos.requests.RegisterOfficerRequest;
import dtos.responses.RegisterOfficerResponse;

import static utils.Mapper.map;

public class OfficerServiceImpl implements OfficerService {
    private OfficerRepository officers = new Officers();



    public RegisterOfficerResponse registerOfficer(RegisterOfficerRequest request){
        if(officers.findByEmail(request.getOfficerEmail()) != null)
            throw new IllegalArgumentException("Officer number already exists");
        Officer officer = map(request);
        officers.save(officer);

        return new RegisterOfficerResponse();
    }

//    @Override
//    public BookTicketResponse bookTicket(BookTicketRequest request) {
////        Officer officer = officers.findById(request.getVehicleId());
//        Vehicle vehicle = vehicles.findById(request.getVehicleId());
//
//
//        Owner owner = new Owner();
//        owner.setEmail(request.getOwnerEmail());
//        owner.setPhone(request.getOwnerPhone());
//
//        vehicle.setOwner(owner);
//        Officer officer = new Officer();
//        Ticket ticket = new Ticket();
//        ticket.setIssuer(officer);
//        ticket.setOffence(offence);
////        vehicle.setTickets(ticket);
//
//        tickets.save(ticket);
//        return new BookTicketResponse();
//
//    }

}
