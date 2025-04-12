package com.mk.spring.finalex.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Reservation {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private int passengers;
    private String travelClass;
    private String phoneNumber;
    private String time;
    private String date;

    public Reservation() {}

    public Reservation(String firstName, String lastName, int passengers, String travelClass, String phoneNumber, String time, String date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passengers = passengers;
        this.travelClass = travelClass;
        this.phoneNumber = phoneNumber;
        this.time = time;
        this.date = date;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getPassengers() { return passengers; }
    public void setPassengers(int passengers) { this.passengers = passengers; }

    public String getTravelClass() { return travelClass; }
    public void setTravelClass(String travelClass) { this.travelClass = travelClass; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
}
