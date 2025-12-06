package com.group13.oopprojectgroup13traffic_management.Mobasshira_Akter.SA;

public class SystemAlerts {
    private String severityWiseSearchAlerts,alertType,location,severityLevel;
    private int timeOfAlert;

    public SystemAlerts(String severityWiseSearchAlerts, String alertType, String location, String severityLevel, int timeOfAlert) {
        this.severityWiseSearchAlerts = severityWiseSearchAlerts;
        this.alertType = alertType;
        this.location = location;
        this.severityLevel = severityLevel;
        this.timeOfAlert = timeOfAlert;
    }

    public String getSeverityWiseSearchAlerts() {
        return severityWiseSearchAlerts;
    }

    public void setSeverityWiseSearchAlerts(String severityWiseSearchAlerts) {
        this.severityWiseSearchAlerts = severityWiseSearchAlerts;
    }

    public String getAlertType() {
        return alertType;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    public int getTimeOfAlert() {
        return timeOfAlert;
    }

    public void setTimeOfAlert(int timeOfAlert) {
        this.timeOfAlert = timeOfAlert;
    }

    @Override
    public String toString() {
        return "SystemAlerts{" +
                "severityWiseSearchAlerts='" + severityWiseSearchAlerts + '\'' +
                ", alertType='" + alertType + '\'' +
                ", location='" + location + '\'' +
                ", severityLevel='" + severityLevel + '\'' +
                ", timeOfAlert=" + timeOfAlert +
                '}';
    }
}
