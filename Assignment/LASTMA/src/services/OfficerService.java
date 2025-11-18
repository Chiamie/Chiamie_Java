package services;

import dtos.requests.BookTicketRequest;
import dtos.requests.RegisterOfficerRequest;
import dtos.requests.ViewTicketRequest;
import dtos.responses.BookTicketResponse;
import dtos.responses.RegisterOfficerResponse;
import dtos.responses.ViewTicketResponse;

public interface OfficerService {
    RegisterOfficerResponse registerOfficer(RegisterOfficerRequest request);
//    BookTicketResponse bookTicket(BookTicketRequest request);
//    ViewTicketResponse viewTicket(ViewTicketRequest viewTicketRequest);

}
