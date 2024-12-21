package models;

import enums.ParkingSpotAssignmentStrategyType;
import lombok.Getter;
import lombok.Setter;
import enums.OperationStatus;
import enums.VehicleType;
import strategies.ParkingSpotAssigmentStrategy;
import strategies.ParkingSpotAssignmentFactory;

import java.util.HashMap;
import java.util.List;

@Getter
@Setter
public class ParkingLot extends BaseEntity {
    private String name;
    private List<ParkingFloor> parkingFloorList;
    private List<Gate> gates;
    private HashMap<VehicleType,Integer> supportedVehicle;
    private OperationStatus status;
    private ParkingSpotAssigmentStrategy strategy;

    public void setStrategy(ParkingSpotAssignmentStrategyType strategy) {
        this.strategy = ParkingSpotAssignmentFactory.getStrategy(strategy);
    }
}
