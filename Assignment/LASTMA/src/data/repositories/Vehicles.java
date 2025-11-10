package data.repositories;

import data.models.Vehicle;
import exceptions.InvalidIdException;

import java.util.ArrayList;
import java.util.List;

public class Vehicles implements VehicleRepository {
    private int count;
    private List<Vehicle> vehicles = new ArrayList<>();

    @Override
    public Vehicle findById(int id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == id) return vehicle;
        }

        throw new InvalidIdException("Vehicle with ID number - " + id + " not found");
    }

    @Override
    public void save(Vehicle vehicle) {
        if (vehicle.getId() == 0) {
            generateId();
            vehicle.setId(count);
            vehicles.add(vehicle);
        }
    }

    private void generateId() {
        ++count;
    }

    @Override
    public  String toString() {
        return "Vehicles{" + "vehicles=" + vehicles + ", count=" + count + '}';
    }

    @Override
    public void delete(Vehicle vehicle) {
        vehicles.remove(vehicle);
        count--;
    }

    @Override
    public List<Vehicle> findAll() {
        return vehicles;
    }

    @Override
    public void deleteAll() {
        vehicles.clear();
        count = 0;
    }

    @Override
    public void deleteById(int id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == id) vehicles.remove(vehicle);
        }
        count--;

    }

    @Override
    public long count() {
        return count;
    }
}
