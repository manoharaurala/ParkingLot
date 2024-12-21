package strategies;

import enums.ParkingSpotAssignmentStrategyType;

public class ParkingSpotAssignmentFactory {
    public static ParkingSpotAssigmentStrategy getStrategy(ParkingSpotAssignmentStrategyType type) {
        if(type== ParkingSpotAssignmentStrategyType.RANDOM) {
            return new RandomSpotAssigmentStrategy();
        }
        return null;
    }
}
