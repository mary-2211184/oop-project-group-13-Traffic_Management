package com.group13.oopprojectgroup13traffic_management.Limu.ParkingsystemManager;

import java.io.Serializable;
import java.time.LocalDate;

public class AddParking implements Serializable {
    private String arenamel;
    private String location;
    private String type;
    private LocalDate date;

    public AddParking(String arenamel, String location, String type, LocalDate date) {
        this.arenamel = arenamel;
        this.location = location;
        this.type = type;
        this.date = date;
    }

    public String getArenamel() {
        return arenamel;
    }

    public void setArenamel(String arenamel) {
        this.arenamel = arenamel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "AddParking{" +
                "arenamel='" + arenamel + '\'' +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                ", date=" + date +
                '}';
    }
}
