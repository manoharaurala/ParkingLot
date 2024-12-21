package models;

import lombok.Getter;
import lombok.Setter;
import models.enums.ParkingSpotStatus;
import models.enums.VehicleType;

@Getter
@Setter
public class ParkingSpot extends BaseEntity {
    private String parkingSpotNumber;
    private VehicleType supportedVehicleType;
    private ParkingSpotStatus spotStatus;
}
