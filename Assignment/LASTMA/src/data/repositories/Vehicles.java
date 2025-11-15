package data.repositories;

import data.models.Ticket;
import data.models.Vehicle;
import exceptions.InvalidIdException;

import java.util.ArrayList;
import java.util.List;

public class Vehicles implements VehicleRepository {
    private int count;
    private static List<Vehicle> vehicles = new ArrayList<>();

    @Override
    public Vehicle findById(int id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == id) return vehicle;
        }

        return null;
    }

    @Override
    public Vehicle save(Vehicle vehicle) {
        if (vehicle.getId() == 0) {
            generateId();
            vehicle.setId(count);
            vehicles.add(vehicle);
            return vehicle;
        }
        else {
            for (int index = 0; index < vehicles.size(); index++) {
                if (vehicles.get(index).getId() == vehicle.getId())
                    vehicles.set(index, vehicle);
            }
        }
       return vehicle;
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
    }

    @Override
    public List<Vehicle> findAll() {
        return vehicles;
    }

    @Override
    public void deleteAll() {
        vehicles.clear();
    }

    @Override
    public void deleteById(int id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == id) vehicles.remove(vehicle);
        }

    }

    @Override
    public long count() {
        return vehicles.size();
    }

    @Override
    public Vehicle findByChasisNumber(String chasisNumber) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getChasisNumber().equals(chasisNumber)) return vehicle;
        }
        return null;
    }


}
