package com.group13.oopprojectgroup13traffic_management.Mobasshira_Akter.TCA;

public class FieldCoordination {
    private String officerName,workLocation,currentLocation,Status,officerCombo;
    private int officerID,date;

    public FieldCoordination(String officerName, String workLocation, String currentLocation, String status, String officerCombo, int officerID, int date) {
        this.officerName = officerName;
        this.workLocation = workLocation;
        this.currentLocation = currentLocation;
        Status = status;
        this.officerCombo = officerCombo;
        this.officerID = officerID;
        this.date = date;
    }

    public String getOfficerName() {
        return officerName;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getOfficerCombo() {
        return officerCombo;
    }

    public void setOfficerCombo(String officerCombo) {
        this.officerCombo = officerCombo;
    }

    public int getOfficerID() {
        return officerID;
    }

    public void setOfficerID(int officerID) {
        this.officerID = officerID;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "FieldCoordination{" +
                "officerName='" + officerName + '\'' +
                ", workLocation='" + workLocation + '\'' +
                ", currentLocation='" + currentLocation + '\'' +
                ", Status='" + Status + '\'' +
                ", officerCombo='" + officerCombo + '\'' +
                ", officerID=" + officerID +
                ", date=" + date +
                '}';
    }
}
