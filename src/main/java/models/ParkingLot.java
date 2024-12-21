package models;

import lombok.Getter;
import lombok.Setter;
import models.enums.OperationStatus;
import models.enums.VehicleType;

import java.util.HashMap;
import java.util.List;

@Getter
@Setter
public class ParkingLot extends BaseEntity {

    private List<ParkingFloor> parkingFloorList;
    private List<Gate> gates;
    private HashMap<VehicleType,Integer> supportedVehicle;
    private OperationStatus status;
}
