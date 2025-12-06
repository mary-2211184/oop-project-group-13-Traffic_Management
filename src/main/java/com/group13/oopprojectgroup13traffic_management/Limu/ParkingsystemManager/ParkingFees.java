package com.group13.oopprojectgroup13traffic_management.Limu.ParkingsystemManager;

import java.io.Serializable;

public class ParkingFees implements Serializable {
    private String vehicleType;
    private  int hours;
    private String mode;
    private String dailyCharge;

    public ParkingFees(String vehicleType, int hours, String mode, String dailyCharge) {
        this.vehicleType = vehicleType;
        this.hours = hours;
        this.mode = mode;
        this.dailyCharge = dailyCharge;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getDailyCharge() {
        return dailyCharge;
    }

    public void setDailyCharge(String dailyCharge) {
        this.dailyCharge = dailyCharge;
    }

    @Override
    public String toString() {
        return "ParkingFees{" +
                "vehicleType='" + vehicleType + '\'' +
                ", hours=" + hours +
                ", mode='" + mode + '\'' +
                ", dailyCharge='" + dailyCharge + '\'' +
                '}';
    }
}
