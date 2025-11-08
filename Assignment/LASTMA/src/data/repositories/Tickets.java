package data.repositories;

import data.models.Offence;
import data.models.Ticket;

import java.util.List;

public class Tickets implements TicketRepository {

    @Override
    public void save(Ticket ticket) {

    }

    @Override
    public Ticket findByTicketNumber(int ticketNumber) {
        return null;
    }

    @Override
    public List<Ticket> findByOffence(Offence offence) {
        return List.of();
    }

    @Override
    public List<Ticket> findAllByVehicleId(int vehicleId) {
        return List.of();
    }

    @Override
    public List<Ticket> findAll() {
        return List.of();
    }

    @Override
    public void delete(int ticketNumber) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void delete(Ticket ticket) {

    }

    @Override
    public long count() {
        return 0;
    }
}
