package services;

import data.models.Vehicle;
import data.repositories.VehicleRepository;
import data.repositories.Vehicles;
import dtos.requests.RegisterOfficerRequest;
import dtos.requests.RegisterVehicleRequest;
import dtos.responses.RegisterVehicleResponse;
import exceptions.InvalidIdException;

import static utils.Mapper.map;

public class VehicleServiceImpl implements VehicleService {
    private VehicleRepository vehicles = new Vehicles();
    @Override
    public RegisterVehicleResponse registerVehicle(RegisterVehicleRequest request) {

        Vehicle dbVechicle = vehicles.findByChasisNumber(request.getChasisNumber());
        if (dbVechicle != null) {
            throw new InvalidIdException("Vehicle already exists");
        }
        Vehicle vehicle = map(request);
        vehicles.save(vehicle);

        return new RegisterVehicleResponse();
    }


}
