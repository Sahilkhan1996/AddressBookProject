package com.bridgelabz.addressbookprogram.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity
@Table(name = "AdressBook")
public class AddressBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sno;
    private String city;
    @NotNull(message = "First Name can not be empty")
    private String firstName;
    private String lastName;
    @Min(value = 300000, message = "The pin number should be more than 30000!!!")
    private Long pinNo;
}
