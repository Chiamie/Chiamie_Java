package dtos.requests;

import data.models.*;

import java.time.LocalDateTime;
import java.time.Year;
import java.util.List;

public class BookTicketRequest {
    private int vehicleId;
    private String offence;
    private String officerEmail;

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getOffence() {
        return offence;
    }

    public void setOffence(String offence) {
        this.offence = offence;
    }

    public String getOfficerEmail() {
        return officerEmail;
    }

    public void setOfficerEmail(String officerEmail) {
        this.officerEmail = officerEmail;
    }
}
