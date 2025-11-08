package data.repositories;

import data.models.Offence;
import data.models.Ticket;
import data.models.Vehicle;

import java.util.List;

public interface TicketRepository {

    void save(Ticket ticket);
    Ticket findByTicketNumber(int ticketNumber);
    List<Ticket> findByOffence(Offence offence);
    List<Ticket> findAllByVehicleId(int vehicleId);
    List<Ticket> findAll();
    void delete(int ticketNumber);
    void deleteAll();
    void delete(Ticket ticket);
    long count();


}
