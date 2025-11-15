package exceptions;

public class InvalidTicketException extends VehicleRepositoryExceptions {
    public InvalidTicketException(String message) {
        super(message);
    }
}
