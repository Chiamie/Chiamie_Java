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

    @Override
    public Ticket save(Ticket ticket) {
        if (ticket.getId() == 0) {
            generateTicketNumber();
            ticket.setId(count);
            tickets.add(ticket);
            return ticket;
        }
        else {
            for (int index = 0; index < tickets.size(); index++) {
                if (tickets.get(index).getId() == ticket.getId())
                    tickets.set(index, ticket);
            }
        }
        return ticket;
    }

    private void generateTicketNumber() {
        count++;
    }

    @Override
    public Ticket findByTicketNumber(int ticketNumber) {
        for(Ticket ticket: tickets){
            if(ticket.getId() == ticketNumber) return ticket;
        }
        return null;
    }

//    @Override
//    public List<Ticket> findByOffence(Offence offence) {
//        return List.of();
//    }

//    @Override
//    public List<Ticket> findAllByVehicleId(int vehicleId) {
//        for(Ticket ticket: tickets){
//            if(ticket.getVehicle().getId() == vehicleId) return tickets;
//        }
//        throw new InvalidIdException("Vehicle id " + vehicleId + " not found");
//    }

    @Override
    public List<Ticket> findAll() {
        return tickets;
    }

    @Override
    public void delete(int ticketNumber) {
        for(Ticket ticket: tickets){
            if(ticket.getId() == ticketNumber) {
                tickets.remove(ticket);
                break;
            }
        }
    }

    @Override
    public void deleteAll() {
        tickets.clear();
    }

    @Override
    public void delete(Ticket ticketToBeDeleted) {
        tickets.remove(ticketToBeDeleted);
    }

    @Override
    public long count() {
        return tickets.size();
    }
}
