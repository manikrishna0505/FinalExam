package com.mk.spring.finalex.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
    @Id
    private String id;
    private String name;
    private String reservationId;

    public Customer() {}
    
    public Customer(String name, String reservationId) {
        this.name = name;
        this.reservationId = reservationId;
    }

    // Getters and Setters
    // (omitted for brevity)
}
