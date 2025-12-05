package com.group13.oopprojectgroup13traffic_management.Limu.policymaker;

import java.io.Serializable;
import java.time.LocalDate;

public class ReviewReport implements Serializable {
    private String reportType;
    private int reportId;
    private String area;
    private LocalDate date;

    public ReviewReport(String reportType, int reportId, String area, LocalDate date) {
        this.reportType = reportType;
        this.reportId = reportId;
        this.area = area;
        this.date = date;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
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
        return "ReviewReport{" +
                "reportType='" + reportType + '\'' +
                ", reportId=" + reportId +
                ", area='" + area + '\'' +
                ", date=" + date +
                '}';
    }
}
