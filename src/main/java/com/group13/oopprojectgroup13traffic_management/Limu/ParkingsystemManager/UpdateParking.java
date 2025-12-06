package com.group13.oopprojectgroup13traffic_management.Limu.ParkingsystemManager;

import java.io.Serializable;
import java.time.LocalDate;

public class UpdateParking implements Serializable {
    private String status;
    private int slotID;
    private String selectArea;
    private LocalDate date;

    public UpdateParking(String status, int slotID, String selectArea, LocalDate date) {
        this.status = status;
        this.slotID = slotID;
        this.selectArea = selectArea;
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSlotID() {
        return slotID;
    }

    public void setSlotID(int slotID) {
        this.slotID = slotID;
    }

    public String getSelectArea() {
        return selectArea;
    }

    public void setSelectArea(String selectArea) {
        this.selectArea = selectArea;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "UpdateParking{" +
                "status='" + status + '\'' +
                ", slotID=" + slotID +
                ", selectArea='" + selectArea + '\'' +
                ", date=" + date +
                '}';
    }
}
