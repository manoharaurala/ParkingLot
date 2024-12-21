package models;

import lombok.Getter;
import lombok.Setter;
import enums.PaymentMode;
import enums.PaymentStatus;

import java.time.LocalDateTime;
@Getter
@Setter
public class Payment extends BaseEntity{
    private int paymentId;
    private double amount;
    private String referenceNumber;
    private PaymentMode paymentMode;
    private LocalDateTime paymentTime;
    private PaymentStatus status;
}
