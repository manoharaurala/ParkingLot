package models;

import lombok.Getter;
import lombok.Setter;
import models.enums.GateType;
import models.enums.OperationStatus;

@Getter
@Setter
public class Gate extends BaseEntity {
    private int gateId;
    private GateType gateType;
    private OperationStatus operationStatus;
}
