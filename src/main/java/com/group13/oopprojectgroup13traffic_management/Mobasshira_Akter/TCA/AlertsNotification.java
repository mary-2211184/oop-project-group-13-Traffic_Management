package com.group13.oopprojectgroup13traffic_management.Mobasshira_Akter.TCA;

public class AlertsNotification {
    private String severityWiseAlert,location,alertType,severity,status;
    private int alertsID,Time,date;

    public AlertsNotification(String severityWiseAlert, String location, String alertType, String severity, String status, int alertsID, int time, int date) {
        this.severityWiseAlert = severityWiseAlert;
        this.location = location;
        this.alertType = alertType;
        this.severity = severity;
        this.status = status;
        this.alertsID = alertsID;
        Time = time;
        this.date = date;
    }

    public String getSeverityWiseAlert() {
        return severityWiseAlert;
    }

    public void setSeverityWiseAlert(String severityWiseAlert) {
        this.severityWiseAlert = severityWiseAlert;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAlertType() {
        return alertType;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAlertsID() {
        return alertsID;
    }

    public void setAlertsID(int alertsID) {
        this.alertsID = alertsID;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int time) {
        Time = time;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "AlertsNotification{" +
                "severityWiseAlert='" + severityWiseAlert + '\'' +
                ", location='" + location + '\'' +
                ", alertType='" + alertType + '\'' +
                ", severity='" + severity + '\'' +
                ", status='" + status + '\'' +
                ", alertsID=" + alertsID +
                ", Time=" + Time +
                ", date=" + date +
                '}';
    }
}
