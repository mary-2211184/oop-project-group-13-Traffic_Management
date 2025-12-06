package com.group13.oopprojectgroup13traffic_management.Mobasshira_Akter.TCA;

public class TrafficForecasting {
    private String forecastZone,forecastRoute,trafficLevel;
    private int selectForecastTime,peakTime,vehicleCount;

    public TrafficForecasting(String forecastZone, String forecastRoute, String trafficLevel, int selectForecastTime, int peakTime, int vehicleCount) {
        this.forecastZone = forecastZone;
        this.forecastRoute = forecastRoute;
        this.trafficLevel = trafficLevel;
        this.selectForecastTime = selectForecastTime;
        this.peakTime = peakTime;
        this.vehicleCount = vehicleCount;
    }

    public String getForecastZone() {
        return forecastZone;
    }

    public void setForecastZone(String forecastZone) {
        this.forecastZone = forecastZone;
    }

    public String getForecastRoute() {
        return forecastRoute;
    }

    public void setForecastRoute(String forecastRoute) {
        this.forecastRoute = forecastRoute;
    }

    public String getTrafficLevel() {
        return trafficLevel;
    }

    public void setTrafficLevel(String trafficLevel) {
        this.trafficLevel = trafficLevel;
    }

    public int getSelectForecastTime() {
        return selectForecastTime;
    }

    public void setSelectForecastTime(int selectForecastTime) {
        this.selectForecastTime = selectForecastTime;
    }

    public int getPeakTime() {
        return peakTime;
    }

    public void setPeakTime(int peakTime) {
        this.peakTime = peakTime;
    }

    public int getVehicleCount() {
        return vehicleCount;
    }

    public void setVehicleCount(int vehicleCount) {
        this.vehicleCount = vehicleCount;
    }

    @Override
    public String toString() {
        return "TrafficForecasting{" +
                "forecastZone='" + forecastZone + '\'' +
                ", forecastRoute='" + forecastRoute + '\'' +
                ", trafficLevel='" + trafficLevel + '\'' +
                ", selectForecastTime=" + selectForecastTime +
                ", peakTime=" + peakTime +
                ", vehicleCount=" + vehicleCount +
                '}';
    }
}
