package com.group13.oopprojectgroup13traffic_management;

import com.group13.oopprojectgroup13traffic_management.MaryChowdhury.ReportRow;

public class ReportRowBuilder {
    private String id;
    private String date;
    private String type;
    private String status;

    public ReportRowBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public ReportRowBuilder setDate(String date) {
        this.date = date;
        return this;
    }

    public ReportRowBuilder setType(String type) {
        this.type = type;
        return this;
    }

    public ReportRowBuilder setStatus(String status) {
        this.status = status;
        return this;
    }

    public ReportRow createReportRow() {
        return new ReportRow(id, date, type, status, "New");
    }
}