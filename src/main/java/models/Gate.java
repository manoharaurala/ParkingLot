package models;

import lombok.Getter;
import lombok.Setter;
import enums.GateType;
import enums.OperationStatus;

@Getter
@Setter
public class Gate extends BaseEntity {
    private int gateId;
    private Opeartor opeartor;
    private GateType gateType;
    private OperationStatus operationStatus;
    private ParkingLot parkingLot;
}
