package com.group13.oopprojectgroup13traffic_management.Mobasshira_Akter.SA;

public class SystemLogs {
    private String selectUser,userName,eventType,details;
    private int userID,startingDate,endingDate;

    public SystemLogs(String selectUser, String userName, String eventType, String details, int userID, int startingDate, int endingDate) {
        this.selectUser = selectUser;
        this.userName = userName;
        this.eventType = eventType;
        this.details = details;
        this.userID = userID;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
    }

    public String getSelectUser() {
        return selectUser;
    }

    public void setSelectUser(String selectUser) {
        this.selectUser = selectUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(int startingDate) {
        this.startingDate = startingDate;
    }

    public int getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(int endingDate) {
        this.endingDate = endingDate;
    }

    @Override
    public String toString() {
        return "SystemLogs{" +
                "selectUser='" + selectUser + '\'' +
                ", userName='" + userName + '\'' +
                ", eventType='" + eventType + '\'' +
                ", details='" + details + '\'' +
                ", userID=" + userID +
                ", startingDate=" + startingDate +
                ", endingDate=" + endingDate +
                '}';
    }
}
