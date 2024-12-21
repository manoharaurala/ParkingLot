package models;

import lombok.Getter;
import lombok.Setter;
import enums.ParkingSpotStatus;
import enums.VehicleType;

@Getter
@Setter
public class ParkingSpot extends BaseEntity {
    private String parkingSpotNumber;
    private VehicleType supportedVehicleType;
    private ParkingSpotStatus spotStatus;
}
