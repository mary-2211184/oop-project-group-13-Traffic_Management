package com.group13.oopprojectgroup13traffic_management.Mobasshira_Akter.TCA;

public class HistoricalData {
    private String area,reportName,mostCongestedZone;
    private int fromDate,toDate,totalIncidents,peakHour,totalVehicles,time;

    public HistoricalData(String area, String reportName, String mostCongestedZone, int fromDate, int toDate, int totalIncidents, int peakHour, int totalVehicles, int time) {
        this.area = area;
        this.reportName = reportName;
        this.mostCongestedZone = mostCongestedZone;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.totalIncidents = totalIncidents;
        this.peakHour = peakHour;
        this.totalVehicles = totalVehicles;
        this.time = time;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getMostCongestedZone() {
        return mostCongestedZone;
    }

    public void setMostCongestedZone(String mostCongestedZone) {
        this.mostCongestedZone = mostCongestedZone;
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

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "HistoricalData{" +
                "area='" + area + '\'' +
                ", reportName='" + reportName + '\'' +
                ", mostCongestedZone='" + mostCongestedZone + '\'' +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", totalIncidents=" + totalIncidents +
                ", peakHour=" + peakHour +
                ", totalVehicles=" + totalVehicles +
                ", time=" + time +
                '}';
    }
}
