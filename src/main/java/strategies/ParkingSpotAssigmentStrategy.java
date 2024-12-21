package strategies;

import models.ParkingLot;
import models.ParkingSpot;
import enums.VehicleType;

public interface ParkingSpotAssigmentStrategy {
    public ParkingSpot assignParkingSpot(ParkingLot parkingLot, VehicleType type);
}
