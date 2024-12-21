package repositories;

import models.Vehicle;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class VehicleRepository {
    private final Map<String,Vehicle> vehicleMap=new TreeMap<>();
    private static int previous_id=0;
    public VehicleRepository() {

    }

    public Optional<Vehicle> findVehicleByNumber(String vehicleNumber) {
        // Get vehicle by id logic
        return vehicleMap.getOrDefault(vehicleNumber, null) != null ? Optional.of(vehicleMap.get(vehicleNumber)) : Optional.empty();
    }

    public Vehicle save(Vehicle vehicle) {
        // Save vehicle logic
        previous_id++;
        vehicle.setId(previous_id);
        vehicleMap.put(vehicle.getVehicleNumber(),vehicle);
        return vehicle;

    }
}
