package models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Ticket extends BaseEntity {
    private Vehicle vehicle;
    private LocalDateTime entryTime;
    private Opeartor opeartor;
    private ParkingSpot parkingSpot;
    private Gate entryGate;

}
