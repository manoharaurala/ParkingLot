package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Opeartor extends BaseEntity{
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private int empId;
}
