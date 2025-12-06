package com.group13.oopprojectgroup13traffic_management.Mobasshira_Akter.TCA;

public class IncidentManagement {
    private String Area,location,type,status;
    private int incidentID,reportType;

    public IncidentManagement(String area, String location, String type, String status, int incidentID, int reportType) {
        Area = area;
        this.location = location;
        this.type = type;
        this.status = status;
        this.incidentID = incidentID;
        this.reportType = reportType;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIncidentID() {
        return incidentID;
    }

    public void setIncidentID(int incidentID) {
        this.incidentID = incidentID;
    }

    public int getReportType() {
        return reportType;
    }

    public void setReportType(int reportType) {
        this.reportType = reportType;
    }
}
