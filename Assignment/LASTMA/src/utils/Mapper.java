package utils;

import data.models.Officer;
import data.models.Owner;
import data.models.Vehicle;
import dtos.requests.RegisterOfficerRequest;
import dtos.requests.RegisterVehicleRequest;

public class Mapper {
    public static Vehicle map(RegisterVehicleRequest request) {
        Vehicle vehicle = new Vehicle();
        Owner owner = new Owner();

        vehicle.setName(request.getVehicleName());
        vehicle.setModel(request.getVehicleModel());
        vehicle.setYear(request.getProductionYear());
        vehicle.setColor(request.getVehicleColor());
        vehicle.setChasisNumber(request.getChasisNumber());

        owner.setName(request.getOwnerName());
        owner.setEmail(request.getOwnerEmail());
        owner.setPhone(request.getOwnerPhone());
        owner.setAddress(request.getOwnerAddress());

        vehicle.setOwner(owner);

        return vehicle;
    }

    public static Officer map(RegisterOfficerRequest request) {
        Officer officer = new Officer();
        officer.setName(request.getOfficerName());
        officer.setRank(request.getOfficerRank());
        officer.setOfficerEmail(request.getOfficerEmail());
        return officer;
    }
}
