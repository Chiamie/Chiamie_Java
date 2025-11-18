package services;

import data.models.Vehicle;
import data.repositories.VehicleRepository;
import data.repositories.Vehicles;
import dtos.requests.RegisterVehicleRequest;
import exceptions.InvalidIdException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleServiceImplTest {
    private VehicleService vehicleService;
    private VehicleRepository vehicleRepository;
    @BeforeEach
    void setUp() {
        vehicleService = new VehicleServiceImpl();
        vehicleRepository = new Vehicles();
    }

    @AfterEach
    void tearDown() {
        vehicleRepository.deleteAll();
    }

    @Test
    public void registerVehicleCountIsOne() {
        RegisterVehicleRequest request = new RegisterVehicleRequest();
        vehicleService.registerVehicle(request);
        assertEquals(1, vehicleRepository.count());
    }

    @Test
    public void registerSameVehicleTwiceCountIsOne() {
        RegisterVehicleRequest request = new RegisterVehicleRequest();
        request.setChasisNumber("turtle");
        vehicleService.registerVehicle(request);
        assertEquals(1, vehicleRepository.count());

        assertThrows(InvalidIdException.class,() -> vehicleService.registerVehicle(request));
        assertEquals(1, vehicleRepository.count());
    }


}