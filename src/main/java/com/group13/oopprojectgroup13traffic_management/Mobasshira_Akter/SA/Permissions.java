package com.group13.oopprojectgroup13traffic_management.Mobasshira_Akter.SA;

public class Permissions {
    private String userName,userRole,permissionAssign,permissionLevel,status,report;
    private int userID,date;

    public Permissions(String userName, String userRole, String permissionAssign, String permissionLevel, String status, String report, int userID, int date) {
        this.userName = userName;
        this.userRole = userRole;
        this.permissionAssign = permissionAssign;
        this.permissionLevel = permissionLevel;
        this.status = status;
        this.report = report;
        this.userID = userID;
        this.date = date;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getPermissionAssign() {
        return permissionAssign;
    }

    public void setPermissionAssign(String permissionAssign) {
        this.permissionAssign = permissionAssign;
    }

    public String getPermissionLevel() {
        return permissionLevel;
    }

    public void setPermissionLevel(String permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Permissions{" +
                "userName='" + userName + '\'' +
                ", userRole='" + userRole + '\'' +
                ", permissionAssign='" + permissionAssign + '\'' +
                ", permissionLevel='" + permissionLevel + '\'' +
                ", status='" + status + '\'' +
                ", report='" + report + '\'' +
                ", userID=" + userID +
                ", date=" + date +
                '}';
    }
}
