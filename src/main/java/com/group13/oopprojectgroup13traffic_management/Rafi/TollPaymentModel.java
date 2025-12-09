package com.group13.oopprojectgroup13traffic_management.Rafi;

import java.io.Serializable;
import java.time.LocalDate;

public class TollPaymentModel implements Serializable {
    private static final long serialVersionUID = 1L;

    // Fields from your controller
    private String cardNumber;
    private String gateNumber;
    private String cvc;
    private String nameOnCard;
    private String carNumber;
    private String time;
    private boolean termsAccepted;
    private String expiryDate;
    private LocalDate paymentDate;
    private String vehicleType;
    private String amount;

    // Constructor
    public TollPaymentModel(String cardNumber, String gateNumber, String cvc,
                            String nameOnCard, String carNumber, String time,
                            boolean termsAccepted, String expiryDate, LocalDate paymentDate,
                            String vehicleType, String amount) {
        this.cardNumber = cardNumber;
        this.gateNumber = gateNumber;
        this.cvc = cvc;
        this.nameOnCard = nameOnCard;
        this.carNumber = carNumber;
        this.time = time;
        this.termsAccepted = termsAccepted;
        this.expiryDate = expiryDate;
        this.paymentDate = paymentDate;
        this.vehicleType = vehicleType;
        this.amount = amount;
    }

    // Getters and Setters
    public String getCardNumber() { return cardNumber; }
    public void setCardNumber(String cardNumber) { this.cardNumber = cardNumber; }

    public String getGateNumber() { return gateNumber; }
    public void setGateNumber(String gateNumber) { this.gateNumber = gateNumber; }

    public String getCvc() { return cvc; }
    public void setCvc(String cvc) { this.cvc = cvc; }

    public String getNameOnCard() { return nameOnCard; }
    public void setNameOnCard(String nameOnCard) { this.nameOnCard = nameOnCard; }

    public String getCarNumber() { return carNumber; }
    public void setCarNumber(String carNumber) { this.carNumber = carNumber; }

    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }

    public boolean isTermsAccepted() { return termsAccepted; }
    public void setTermsAccepted(boolean termsAccepted) { this.termsAccepted = termsAccepted; }

    public String getExpiryDate() { return expiryDate; }
    public void setExpiryDate(String expiryDate) { this.expiryDate = expiryDate; }

    public LocalDate getPaymentDate() { return paymentDate; }
    public void setPaymentDate(LocalDate paymentDate) { this.paymentDate = paymentDate; }

    public String getVehicleType() { return vehicleType; }
    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }

    public String getAmount() { return amount; }
    public void setAmount(String amount) { this.amount = amount; }

    @Override
    public String toString() {
        return "TollPaymentModel{" +
                "cardNumber='" + cardNumber + '\'' +
                ", gateNumber='" + gateNumber + '\'' +
                ", cvc='" + cvc + '\'' +
                ", nameOnCard='" + nameOnCard + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", time='" + time + '\'' +
                ", termsAccepted=" + termsAccepted +
                ", expiryDate='" + expiryDate + '\'' +
                ", paymentDate=" + paymentDate +
                ", vehicleType='" + vehicleType + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}