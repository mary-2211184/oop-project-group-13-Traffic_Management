package com.group13.oopprojectgroup13traffic_management.Limu.policymaker;

import java.io.Serializable;
import java.time.LocalDate;

public class PublicPublishAnnouncement implements Serializable {
    private String annoTitlel;
    private  String message;
    private String area;
    private LocalDate date;

    public PublicPublishAnnouncement(String annoTitlel, String message, String area, LocalDate date) {
        this.annoTitlel = annoTitlel;
        this.message = message;
        this.area = area;
        this.date = date;
    }

    public String getAnnoTitlel() {
        return annoTitlel;
    }

    public void setAnnoTitlel(String annoTitlel) {
        this.annoTitlel = annoTitlel;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "PublicPublishAnnouncement{" +
                "annoTitlel='" + annoTitlel + '\'' +
                ", message='" + message + '\'' +
                ", area='" + area + '\'' +
                ", date=" + date +
                '}';
    }
}
