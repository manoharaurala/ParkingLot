package dtos;

import lombok.Getter;
import lombok.Setter;
import models.enums.VehicleType;

@Getter
@Setter
public class IssueTicketRequestDTO {
    private String vehicleNumber;
    private VehicleType vehicleType;
    private String ownerName;
    private int gateId;
}
