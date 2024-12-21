package dtos;

import lombok.Getter;
import lombok.Setter;
import models.enums.ResponseStatus;

@Getter
@Setter
public class IssueTicketResponseDTO {
    private int ticketId;
    private String slotNumber;
    private ResponseStatus responseStatus;
    private String failureMessage;

}
