package models;

import lombok.Getter;
import lombok.Setter;
import enums.VehicleType;

import java.util.List;

@Getter
@Setter
public class ParkingFloor extends BaseEntity {
    private int parkingFloorId;
    private List<ParkingSpot> parkingSpots;
    private List<VehicleType> supportedVehicleTypes;

}
