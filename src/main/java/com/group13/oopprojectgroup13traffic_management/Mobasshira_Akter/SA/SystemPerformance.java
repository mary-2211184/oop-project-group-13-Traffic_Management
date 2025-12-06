package com.group13.oopprojectgroup13traffic_management.Mobasshira_Akter.SA;

public class SystemPerformance {
    private String severity,notes,status;
    private int upTime,latency,time,date;

    public SystemPerformance(String severity, String notes, String status, int upTime, int latency, int time, int date) {
        this.severity = severity;
        this.notes = notes;
        this.status = status;
        this.upTime = upTime;
        this.latency = latency;
        this.time = time;
        this.date = date;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getUpTime() {
        return upTime;
    }

    public void setUpTime(int upTime) {
        this.upTime = upTime;
    }

    public int getLatency() {
        return latency;
    }

    public void setLatency(int latency) {
        this.latency = latency;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "SystemPerformance{" +
                "severity='" + severity + '\'' +
                ", notes='" + notes + '\'' +
                ", status='" + status + '\'' +
                ", upTime=" + upTime +
                ", latency=" + latency +
                ", time=" + time +
                ", date=" + date +
                '}';
    }
}
