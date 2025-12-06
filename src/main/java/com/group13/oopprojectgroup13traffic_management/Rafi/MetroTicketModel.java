package com.group13.oopprojectgroup13traffic_management.Rafi;

import java.io.Serializable;

public class MetroTicketModel implements Serializable {
    private static final long serialVersionUID = 1L;

    // Fields from your controller
    private String ticketDate;
    private String cvc;
    private String cardNumber;
    private boolean femaleReservation;
    private boolean termsAccepted;
    private String nameOnCard;
    private String fromStation;
    private String expiryDate;
    private String travelTime;
    private String toStation;
    private String paymentAmount;

    // Constructor
    public MetroTicketModel(String ticketDate, String cvc, String cardNumber,
                            boolean femaleReservation, boolean termsAccepted,
                            String nameOnCard, String fromStation, String expiryDate,
                            String travelTime, String toStation, String paymentAmount) {
        this.ticketDate = ticketDate;
        this.cvc = cvc;
        this.cardNumber = cardNumber;
        this.femaleReservation = femaleReservation;
        this.termsAccepted = termsAccepted;
        this.nameOnCard = nameOnCard;
        this.fromStation = fromStation;
        this.expiryDate = expiryDate;
        this.travelTime = travelTime;
        this.toStation = toStation;
        this.paymentAmount = paymentAmount;
    }

    // Getters and Setters
    public String getTicketDate() { return ticketDate; }
    public void setTicketDate(String ticketDate) { this.ticketDate = ticketDate; }

    public String getCvc() { return cvc; }
    public void setCvc(String cvc) { this.cvc = cvc; }

    public String getCardNumber() { return cardNumber; }
    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }

    public boolean isFemaleReservation() { return femaleReservation; }
    public void setFemaleReservation(boolean femaleReservation) { this.femaleReservation = femaleReservation; }

    public boolean isTermsAccepted() { return termsAccepted; }
    public void setTermsAccepted(boolean termsAccepted) { this.termsAccepted = termsAccepted; }

    public String getNameOnCard() { return nameOnCard; }
    public void setNameOnCard(String nameOnCard) { this.nameOnCard = nameOnCard; }

    public String getFromStation() { return fromStation; }
    public void setFromStation(String fromStation) { this.fromStation = fromStation; }

    public String getExpiryDate() { return expiryDate; }
    public void setExpiryDate(String expiryDate) { this.expiryDate = expiryDate; }

    public String getTravelTime() { return travelTime; }
    public void setTravelTime(String travelTime) { this.travelTime = travelTime; }

    public String getToStation() { return toStation; }
    public void setToStation(String toStation) { this.toStation = toStation; }

    public String getPaymentAmount() { return paymentAmount; }
    public void setPaymentAmount(String paymentAmount) { this.paymentAmount = paymentAmount; }

    @Override
    public String toString() {
        return "MetroTicketModel{" +
                "ticketDate='" + ticketDate + '\'' +
                ", cvc='" + cvc + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", femaleReservation=" + femaleReservation +
                ", termsAccepted=" + termsAccepted +
                ", nameOnCard='" + nameOnCard + '\'' +
                ", fromStation='" + fromStation + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                ", travelTime='" + travelTime + '\'' +
                ", toStation='" + toStation + '\'' +
                ", paymentAmount='" + paymentAmount + '\'' +
                '}';
    }
}