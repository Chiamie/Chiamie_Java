package services;

import data.repositories.OfficerRepository;
import data.repositories.Officers;
import dtos.requests.RegisterOfficerRequest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficerServiceImplTest {
    private  OfficerService officerService;
    private OfficerRepository officers;
    @BeforeEach
    void setUp() {
        officerService = new OfficerServiceImpl();
        officers = new Officers();
    }

    @AfterEach
    void tearDown() {
        officers.deleteAll();
    }

    @Test
    void registerOfficerCountIsOne() {
        RegisterOfficerRequest request = new RegisterOfficerRequest();
        officerService.registerOfficer(request);
        assertEquals(1, officers.count());
    }

    @Test
    void registerSameOfficerTwiceCountIsStillOne() {
        RegisterOfficerRequest request = new RegisterOfficerRequest();
        request.setOfficerEmail("feyi@gmail.com");
        officerService.registerOfficer(request);

        assertThrows(IllegalArgumentException.class, ()-> officerService.registerOfficer(request));
        assertEquals(1, officers.count());
    }
}