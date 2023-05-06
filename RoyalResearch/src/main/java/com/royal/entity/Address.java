package com.royal.entity;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class Address {
    @NotBlank
    private String street;

    @NotBlank
    private String city;

    @NotBlank
    private String state;

    private String zipCode;

    
}






