package services;

import dtos.requests.RegisterOfficerRequest;
import dtos.requests.RegisterVehicleRequest;
import dtos.requests.SettleTicketRequest;
import dtos.responses.RegisterVehicleResponse;
import dtos.responses.SettleTicketResponse;

public interface VehicleService {
    RegisterVehicleResponse registerVehicle(RegisterVehicleRequest request);
//    SettleTicketResponse uploadReceipt(SettleTicketRequest request);

}
