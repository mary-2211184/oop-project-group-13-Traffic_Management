package com.group13.oopprojectgroup13traffic_management.Limu.ParkingsystemManager;

import java.io.Serializable;
import java.time.LocalDate;

public class RecordVehicle implements Serializable {
    private int  vehicleNumber;
    private String type;
    private String contact;
    private LocalDate date;

    public RecordVehicle(int vehicleNumber, String type, String contact, LocalDate date) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.contact = contact;
        this.date = date;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "RecordVehicle{" +
                "vehicleNumber=" + vehicleNumber +
                ", type='" + type + '\'' +
                ", contact='" + contact + '\'' +
                ", date=" + date +
                '}';
    }
}
