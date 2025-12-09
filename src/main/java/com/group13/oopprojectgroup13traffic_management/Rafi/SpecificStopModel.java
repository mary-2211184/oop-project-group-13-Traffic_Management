package com.group13.oopprojectgroup13traffic_management.Rafi;

import java.io.Serializable;
import java.time.LocalDate;

public class SpecificStopModel implements Serializable {
    private static final long serialVersionUID = 1L;

    // These variables will store the data from your form
    private LocalDate stopDate;
    private String stopNumber;
    private String arrivalTime;
    private String occupiedSeats;
    private String stopFee;
    private String paymentOption;
    private boolean termsAccepted;
    private String emptySeats;
    private String departureTime;
    private String routeNumber;
    private String busNumber;

    // Constructor to save all data
    public SpecificStopModel(LocalDate stopDate, String stopNumber, String arrivalTime,
                             String occupiedSeats, String stopFee, String paymentOption,
                             boolean termsAccepted, String emptySeats, String departureTime,
                             String routeNumber, String busNumber) {
        this.stopDate = stopDate;
        this.stopNumber = stopNumber;
        this.arrivalTime = arrivalTime;
        this.occupiedSeats = occupiedSeats;
        this.stopFee = stopFee;
        this.paymentOption = paymentOption;
        this.termsAccepted = termsAccepted;
        this.emptySeats = emptySeats;
        this.departureTime = departureTime;
        this.routeNumber = routeNumber;
        this.busNumber = busNumber;
    }

    // Getter methods (to read data later)
    public LocalDate getStopDate() { return stopDate; }
    public String getStopNumber() { return stopNumber; }
    public String getArrivalTime() { return arrivalTime; }
    public String getOccupiedSeats() { return occupiedSeats; }
    public String getStopFee() { return stopFee; }
    public String getPaymentOption() { return paymentOption; }
    public boolean isTermsAccepted() { return termsAccepted; }
    public String getEmptySeats() { return emptySeats; }
    public String getDepartureTime() { return departureTime; }
    public String getRouteNumber() { return routeNumber; }
    public String getBusNumber() { return busNumber; }

    @Override
    public String toString() {
        return "Stop Record: Bus " + busNumber + ", Route " + routeNumber +
                ", Date: " + stopDate + ", Stop: " + stopNumber;
    }
}