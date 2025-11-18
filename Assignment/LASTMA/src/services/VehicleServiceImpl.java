package services;

import data.models.Vehicle;
import data.repositories.VehicleRepository;
import data.repositories.Vehicles;
import dtos.requests.RegisterOfficerRequest;
import dtos.requests.RegisterVehicleRequest;
import dtos.requests.SettleTicketRequest;
import dtos.responses.RegisterVehicleResponse;
import dtos.responses.SettleTicketResponse;
import exceptions.InvalidIdException;
import exceptions.InvalidTellerException;

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

//    @Override
//    public SettleTicketResponse uploadReceipt(SettleTicketRequest request) {
//        String regex = "String regex = \"(?i)([A-Za-z\\\\s]+)\\\\s+(2[\\\\/\\\\-]2[\\\\/\\\\-]4)\\\\s+₦?([\\\\d,]+(?:\\\\.\\\\d+)?)\\\\s+(\\1̣1̣)";
//        if(!request.getPaymentTeller().matches(regex)){
//            throw new InvalidTellerException("Invalid Payment Teller");
//        }
//        else if(request.getPaymentTeller().matches(regex) && request.getPaymentTeller().substring(request.getPaymentTeller().length()-2).equals("2")
//
//        }
//
//        return null;
//    }



}
