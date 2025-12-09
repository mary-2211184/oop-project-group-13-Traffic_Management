package com.group13.oopprojectgroup13traffic_management.Mobasshira_Akter.TCA;

public class Traffic_Monitor {
    private String currentPeakArea, highestCongestionLevel, areaFilterArea;
    private int totalActiveCamera, averageTrafficFlow, date, time, vehicleCount;

    // FIX: Constructor name MUST match class name exactly
    // You had: public void TrafficMonitor(...) - WRONG!
    // Correct: public Traffic_Monitor(...) - RIGHT!
    public Traffic_Monitor(String currentPeakArea, String highestCongestionLevel, String areaFilterArea,
                           int totalActiveCamera, int averageTrafficFlow, int date, int time, int vehicleCount) {
        this.currentPeakArea = currentPeakArea;
        this.highestCongestionLevel = highestCongestionLevel;
        this.areaFilterArea = areaFilterArea;
        this.totalActiveCamera = totalActiveCamera;
        this.averageTrafficFlow = averageTrafficFlow;
        this.date = date;
        this.time = time;
        this.vehicleCount = vehicleCount;
    }

    // ... rest of your getters/setters remain the same ...
    // Keep all your existing getters and setters
}