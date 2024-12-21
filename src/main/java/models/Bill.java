package models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class Bill extends BaseEntity {
    private double amount;
    private LocalDateTime exitTime;
    private Ticket ticket;
    private Gate exitGate;
    private Opeartor opeartor;
    private Payment payment;
}
