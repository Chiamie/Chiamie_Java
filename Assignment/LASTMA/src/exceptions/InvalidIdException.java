package dtos.responses;

import exceptions.VehicleRepositoryExceptions;

public class InvalidIdException extends VehicleRepositoryExceptions {
    public InvalidIdException(String message) {
        super(message);
    }
}
