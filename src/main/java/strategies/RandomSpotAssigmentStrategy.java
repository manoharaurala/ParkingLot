package strategies;

import models.ParkingFloor;
import models.ParkingLot;
import models.ParkingSpot;
import enums.VehicleType;

import static enums.ParkingSpotStatus.FREE;

public class RandomSpotAssigmentStrategy implements ParkingSpotAssigmentStrategy {
    @Override
    public ParkingSpot assignParkingSpot(ParkingLot parkingLot, VehicleType type) {
        // Implement the method here
        for (ParkingFloor parkingFloor : parkingLot.getParkingFloorList()) {
            for (ParkingSpot parkingSpot : parkingFloor.getParkingSpots()) {
                if (parkingSpot.getSupportedVehicleType().equals(type) && parkingSpot.getSpotStatus() == FREE) {
                    return parkingSpot;
                }
            }

        }
        return null;
    }
}

//Parking Lot:for all the floor
    //for a floor:for all the parking spot
        //slot is empty && slot support the vehicle type
            //return the slot

