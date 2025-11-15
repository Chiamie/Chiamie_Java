package exceptions;

public class InvalidOfficerEmailException extends VehicleRepositoryExceptions {
    public InvalidOfficerEmailException(String message) {
        super(message);
    }
}
