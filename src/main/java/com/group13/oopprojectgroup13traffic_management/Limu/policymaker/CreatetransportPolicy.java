package com.group13.oopprojectgroup13traffic_management.Limu.policymaker;

import java.io.Serializable;
import java.time.LocalDate;

public class CreatetransportPolicy implements Serializable {
    private String policyTitle;
    private String des;
    private String category;
    private LocalDate date;

    public CreatetransportPolicy(String policyTitle, String des, String category, LocalDate date) {
        this.policyTitle = policyTitle;
        this.des = des;
        this.category = category;
        this.date = date;
    }

    public String getPolicyTitle() {
        return policyTitle;
    }

    public void setPolicyTitle(String policyTitle) {
        this.policyTitle = policyTitle;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "CreatetransportPolicy{" +
                "policyTitle='" + policyTitle + '\'' +
                ", des='" + des + '\'' +
                ", category='" + category + '\'' +
                ", date=" + date +
                '}';
    }
}
