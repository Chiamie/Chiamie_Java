package dtos.requests;

import data.models.Offence;
import data.models.Officer;
import data.models.Vehicle;

import java.time.LocalDateTime;

public class ViewTicketRequest {
    private int vehicleId;

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }
}
