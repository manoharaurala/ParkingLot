package services;

import CustomExceptions.InvalidGateException;
import enums.VehicleType;
import models.*;
import repositories.GateRepository;
import repositories.TicketRepository;
import repositories.VehicleRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public class TicketService {
    private final GateRepository gateRepository;
    private final VehicleRepository vehicleRepository;
    private final TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(int gateId, String vehicleNumber, String ownerName, VehicleType vehicleType) {
        // Issue ticket logic
        Ticket ticket = new Ticket();
        Optional<Gate> gateOptional = gateRepository.findGateById(gateId);
        if (gateOptional.isPresent()) {
            ticket.setEntryGate(gateOptional.get());
            ticket.setOpeartor(gateOptional.get().getOpeartor());
        } else {
            throw new InvalidGateException("Gate not found");
        }
        ticket.setEntryTime(LocalDateTime.now());

        Optional<Vehicle> vehicleOptional = vehicleRepository.findVehicleByNumber(vehicleNumber);
        Vehicle vehicle;
        if (vehicleOptional.isPresent()) {
            vehicle = vehicleOptional.get();
        } else {
            vehicle = new Vehicle();
            vehicle.setDriverName(ownerName);
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setVehicleType(vehicleType);
            ticket.setVehicle(vehicle);
            vehicle = vehicleRepository.save(vehicle);

        }
        ticket.setVehicle(vehicle);
        ParkingLot parkingLot = gateOptional.get().getParkingLot();
        ParkingSpot parkingSpot =
                parkingLot
                        .getStrategy()
                        .assignParkingSpot(parkingLot, vehicleType);
        ticket.setParkingSpot(parkingSpot);
        return ticketRepository.save(ticket);

    }
}
