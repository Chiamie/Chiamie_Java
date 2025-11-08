package data.repositories;

import data.models.Vehicle;

import java.util.List;

public interface VehicleRepository {
    Vehicle findById(int id);
    void save(Vehicle vehicle);
    void delete(Vehicle vehicle);
    List<Vehicle> findAll();
    void deleteAll();
    void deleteById(int id);
    long count();
}
