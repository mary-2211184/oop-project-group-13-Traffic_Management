package com.group13.oopprojectgroup13traffic_management.Rafi;

import java.io.Serializable;
import java.time.LocalDate;

public class CustomWorkModel implements Serializable {
    private static final long serialVersionUID = 1L;

    // These variables will store the data from your form
    private String shiftType;
    private String currentStop;
    private LocalDate requestedDate;
    private String reason;
    private String requestedStop;
    private String shiftTime;
    private LocalDate localDate;

    // Constructor to save all data
    public CustomWorkModel(String shiftType, String currentStop, LocalDate requestedDate,
                           String reason, String requestedStop, String shiftTime,
                           LocalDate localDate) {
        this.shiftType = shiftType;
        this.currentStop = currentStop;
        this.requestedDate = requestedDate;
        this.reason = reason;
        this.requestedStop = requestedStop;
        this.shiftTime = shiftTime;
        this.localDate = localDate;
    }

    // Getter methods (to read data later)
    public String getShiftType() { return shiftType; }
    public String getCurrentStop() { return currentStop; }
    public LocalDate getRequestedDate() { return requestedDate; }
    public String getReason() { return reason; }
    public String getRequestedStop() { return requestedStop; }
    public String getShiftTime() { return shiftTime; }
    public LocalDate getLocalDate() { return localDate; }

    @Override
    public String toString() {
        return "Work Shift Request: " + shiftType + " shift at " + requestedStop +
                " on " + requestedDate;
    }
}