package data.repositories;

import data.models.Offence;
import data.models.Ticket;
import exceptions.InvalidIdException;
import exceptions.InvalidTicketException;

import java.util.ArrayList;
import java.util.List;

public class Tickets implements TicketRepository {
    private int count;
    private List<Ticket> tickets = new ArrayList<>();
//    private Vehicle vehicle;
//
//    public Tickets(Vehicle vehicle) {
//        this.vehicle = vehicle;
//    }

    @Override
    public void save(Ticket ticket) {
        generateTicketNumber();
        ticket.setId(count);
        tickets.add(ticket);
    }

    private void generateTicketNumber() {
        count++;
    }

    @Override
    public Ticket findByTicketNumber(int ticketNumber) {
        for(Ticket ticket: tickets){
            if(ticket.getId() == ticketNumber) return ticket;
        }
        throw new InvalidIdException("Ticket number " + ticketNumber + " not found");
    }

    @Override
    public List<Ticket> findByOffence(Offence offence) {
        return List.of();
    }

    @Override
    public List<Ticket> findAllByVehicleId(int vehicleId) {
        for(Ticket ticket: tickets){
            if(ticket.getVehicle().getId() == vehicleId) return tickets;
        }
        throw new InvalidIdException("Vehicle id " + vehicleId + " not found");
    }

    @Override
    public List<Ticket> findAll() {
        return tickets;
    }

    @Override
    public void delete(int ticketNumber) {
        if(!tickets.removeIf(ticket -> ticket.getId() == ticketNumber))
            throw new InvalidIdException("Ticket number " + ticketNumber + " not found");
    }

    @Override
    public void deleteAll() {
        tickets.clear();
    }

    @Override
    public void delete(Ticket ticketToBeDeleted) {
        if(!tickets.remove(ticketToBeDeleted)) throw new InvalidTicketException("Ticket  " + ticketToBeDeleted + " not found");
    }

    @Override
    public long count() {
        return tickets.size();
    }
}
