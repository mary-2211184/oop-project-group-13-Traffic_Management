package com.group13.oopprojectgroup13traffic_management.Mobasshira_Akter.TCA;

public class SignalOptimization {
    private String area,congestionLevel;
    private int red,yellow,green,time,vehicleCount;

    public SignalOptimization(String area, String congestionLevel, int red, int yellow, int green, int time, int vehicleCount) {
        this.area = area;
        this.congestionLevel = congestionLevel;
        this.red = red;
        this.yellow = yellow;
        this.green = green;
        this.time = time;
        this.vehicleCount = vehicleCount;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCongestionLevel() {
        return congestionLevel;
    }

    public void setCongestionLevel(String congestionLevel) {
        this.congestionLevel = congestionLevel;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getYellow() {
        return yellow;
    }

    public void setYellow(int yellow) {
        this.yellow = yellow;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getVehicleCount() {
        return vehicleCount;
    }

    public void setVehicleCount(int vehicleCount) {
        this.vehicleCount = vehicleCount;
    }

    @Override
    public String toString() {
        return "SignalOptimization{" +
                "area='" + area + '\'' +
                ", congestionLevel='" + congestionLevel + '\'' +
                ", red=" + red +
                ", yellow=" + yellow +
                ", green=" + green +
                ", time=" + time +
                ", vehicleCount=" + vehicleCount +
                '}';
    }
}

