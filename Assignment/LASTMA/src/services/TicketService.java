package services;

import dtos.requests.BookTicketRequest;
import dtos.requests.SettleTicketRequest;
import dtos.requests.ViewTicketRequest;
import dtos.responses.BookTicketResponse;
import dtos.responses.SettleTicketResponse;
import dtos.responses.ViewTicketResponse;

public interface TicketService {
    BookTicketResponse bookTicket(BookTicketRequest bookTicketRequest);
    ViewTicketResponse viewTicket(ViewTicketRequest viewTicketRequest);
    SettleTicketResponse settleTicket(SettleTicketRequest settleTicketRequest);
}
