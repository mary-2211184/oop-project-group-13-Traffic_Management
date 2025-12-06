package com.group13.oopprojectgroup13traffic_management.Mobasshira_Akter.TCA;

public class Reports {
    private String reportType,mostCongestedZone,location,trafficDencity,congestionLevel,incident;
    private int fromDate,toDate,totalIncidents,peakHour,totalVehicles,date;

    public Reports(String reportType, String mostCongestedZone, String location, String trafficDencity, String congestionLevel, String incident, int fromDate, int toDate, int totalIncidents, int peakHour, int totalVehicles, int date) {
        this.reportType = reportType;
        this.mostCongestedZone = mostCongestedZone;
        this.location = location;
        this.trafficDencity = trafficDencity;
        this.congestionLevel = congestionLevel;
        this.incident = incident;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.totalIncidents = totalIncidents;
        this.peakHour = peakHour;
        this.totalVehicles = totalVehicles;
        this.date = date;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getMostCongestedZone() {
        return mostCongestedZone;
    }

    public void setMostCongestedZone(String mostCongestedZone) {
        this.mostCongestedZone = mostCongestedZone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTrafficDencity() {
        return trafficDencity;
    }

    public void setTrafficDencity(String trafficDencity) {
        this.trafficDencity = trafficDencity;
    }

    public String getCongestionLevel() {
        return congestionLevel;
    }

    public void setCongestionLevel(String congestionLevel) {
        this.congestionLevel = congestionLevel;
    }

    public String getIncident() {
        return incident;
    }

    public void setIncident(String incident) {
        this.incident = incident;
    }

    public int getFromDate() {
        return fromDate;
    }

    public void setFromDate(int fromDate) {
        this.fromDate = fromDate;
    }

    public int getToDate() {
        return toDate;
    }

    public void setToDate(int toDate) {
        this.toDate = toDate;
    }

    public int getTotalIncidents() {
        return totalIncidents;
    }

    public void setTotalIncidents(int totalIncidents) {
        this.totalIncidents = totalIncidents;
    }

    public int getPeakHour() {
        return peakHour;
    }

    public void setPeakHour(int peakHour) {
        this.peakHour = peakHour;
    }

    public int getTotalVehicles() {
        return totalVehicles;
    }

    public void setTotalVehicles(int totalVehicles) {
        this.totalVehicles = totalVehicles;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reports{" +
                "reportType='" + reportType + '\'' +
                ", mostCongestedZone='" + mostCongestedZone + '\'' +
                ", location='" + location + '\'' +
                ", trafficDencity='" + trafficDencity + '\'' +
                ", congestionLevel='" + congestionLevel + '\'' +
                ", incident='" + incident + '\'' +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", totalIncidents=" + totalIncidents +
                ", peakHour=" + peakHour +
                ", totalVehicles=" + totalVehicles +
                ", date=" + date +
                '}';
    }
}
