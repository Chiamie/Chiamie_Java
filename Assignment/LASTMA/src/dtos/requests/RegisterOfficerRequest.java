package dtos.requests;

public class RegisterOfficerRequest {
    private String officerName;
    private String officerRank;
    private String officerEmail;

    public String getOfficerName() {
        return officerName;
    }

    public String getOfficerEmail() {
        return officerEmail;
    }

    public void setOfficerEmail(String officerEmail) {
        this.officerEmail = officerEmail;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }

    public String getOfficerRank() {
        return officerRank;
    }

    public void setOfficerRank(String officerRank) {
        this.officerRank = officerRank;
    }
}
