package controllers;

import dtos.IssueTicketRequestDTO;
import dtos.IssueTicketResponseDTO;
import models.Ticket;
import models.enums.ResponseStatus;
import services.TicketService;

public class TicketController {
    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO ticketRequestDTO) {
        IssueTicketResponseDTO issueTicketResponseDTO = new IssueTicketResponseDTO();
        try {
            Ticket ticket = ticketService.issueTicket(
                    ticketRequestDTO.getGateId(),
                    ticketRequestDTO.getVehicleNumber(),
                    ticketRequestDTO.getOwnerName(),
                    ticketRequestDTO.getVehicleType());
            issueTicketResponseDTO.setTicketId(ticket.getId());
            issueTicketResponseDTO.setSlotNumber(ticket.getParkingSpot().getParkingSpotNumber());
            issueTicketResponseDTO.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (RuntimeException e) {
            issueTicketResponseDTO.setResponseStatus(ResponseStatus.FAILURE);
            issueTicketResponseDTO.setFailureMessage(e.getMessage());

        }
        return issueTicketResponseDTO;
    }
}
