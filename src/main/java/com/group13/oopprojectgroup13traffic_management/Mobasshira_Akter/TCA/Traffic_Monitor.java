package com.group13.oopprojectgroup13traffic_management.Mobasshira_Akter.TCA;

public class Traffic_Monitor {
    private String currentPeakArea,highestCongestionLevel,areaFilterArea;
    private int totalActiveCamera,averageTrafficFlow,date,time,vehicleCount;

    public void TrafficMonitor(String currentPeakArea, String highestCongestionLevel, String areaFilterArea, int totalActiveCamera, int averageTrafficFlow, int date, int time, int vehicleCount) {
        this.currentPeakArea = currentPeakArea;
        this.highestCongestionLevel = highestCongestionLevel;
        this.areaFilterArea = areaFilterArea;
        this.totalActiveCamera = totalActiveCamera;
        this.averageTrafficFlow = averageTrafficFlow;
        this.date = date;
        this.time = time;
        this.vehicleCount = vehicleCount;
    }

    public String getCurrentPeakArea() {
        return currentPeakArea;
    }

    public void setCurrentPeakArea(String currentPeakArea) {
        this.currentPeakArea = currentPeakArea;
    }

    public String getHighestCongestionLevel() {
        return highestCongestionLevel;
    }

    public void setHighestCongestionLevel(String highestCongestionLevel) {
        this.highestCongestionLevel = highestCongestionLevel;
    }

    public String getAreaFilterArea() {
        return areaFilterArea;
    }

    public void setAreaFilterArea(String areaFilterArea) {
        this.areaFilterArea = areaFilterArea;
    }

    public int getTotalActiveCamera() {
        return totalActiveCamera;
    }

    public void setTotalActiveCamera(int totalActiveCamera) {
        this.totalActiveCamera = totalActiveCamera;
    }

    public int getAverageTrafficFlow() {
        return averageTrafficFlow;
    }

    public void setAverageTrafficFlow(int averageTrafficFlow) {
        this.averageTrafficFlow = averageTrafficFlow;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
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
        return "TrafficMonitor{" +
                "currentPeakArea='" + currentPeakArea + '\'' +
                ", highestCongestionLevel='" + highestCongestionLevel + '\'' +
                ", areaFilterArea='" + areaFilterArea + '\'' +
                ", totalActiveCamera=" + totalActiveCamera +
                ", averageTrafficFlow=" + averageTrafficFlow +
                ", date=" + date +
                ", time=" + time +
                ", vehicleCount=" + vehicleCount +
                '}';
    }


}

