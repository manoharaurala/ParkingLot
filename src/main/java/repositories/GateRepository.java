package repositories;

import models.Gate;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {
    private Map<Integer,Gate>gateMap=new TreeMap<>();


    public void setGate(Gate gate) {
        gateMap.put(gate.getGateId(),gate);
    }

    public Optional<Gate> findGateById(int gateId) {
        // Get gate by id logic
        return gateMap.getOrDefault(gateId, null) != null ? Optional.of(gateMap.get(gateId)) : Optional.empty();

    }
}
