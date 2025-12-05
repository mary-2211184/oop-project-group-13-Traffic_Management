package com.group13.oopprojectgroup13traffic_management.Limu.policymaker;

import java.io.Serializable;
import java.time.LocalDate;

public class ManageFeedback implements Serializable {
    private String feedbackMessage;
    private String status;
    private int fedId;
    private LocalDate date;

    public ManageFeedback(String feedbackMessage, String status, int fedId, LocalDate date) {
        this.feedbackMessage = feedbackMessage;
        this.status = status;
        this.fedId = fedId;
        this.date = date;
    }

    public String getFeedbackMessage() {
        return feedbackMessage;
    }

    public void setFeedbackMessage(String feedbackMessage) {
        this.feedbackMessage = feedbackMessage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getFedId() {
        return fedId;
    }

    public void setFedId(int fedId) {
        this.fedId = fedId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ManageFeedback{" +
                "feedbackMessage='" + feedbackMessage + '\'' +
                ", status='" + status + '\'' +
                ", fedId=" + fedId +
                ", date=" + date +
                '}';
    }
}
