package models;

import lombok.Getter;
import lombok.Setter;
import enums.VehicleType;

@Getter
@Setter
public class Vehicle extends BaseEntity{
    private int vehicleId;
    private String vehicleNumber;
    private VehicleType vehicleType;
    private String driverName;
    private String driverContact;
}
