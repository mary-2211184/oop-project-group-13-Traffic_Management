package com.group13.oopprojectgroup13traffic_management.Mobasshira_Akter.SA;

public class UserManagement {
    private String searchUser,userName,role,status,lastLogin,location;
    private int userID,date;

    public UserManagement(String searchUser, String userName, String role, String status, String lastLogin, String location, int userID, int date) {
        this.searchUser = searchUser;
        this.userName = userName;
        this.role = role;
        this.status = status;
        this.lastLogin = lastLogin;
        this.location = location;
        this.userID = userID;
        this.date = date;
    }

    public String getSearchUser() {
        return searchUser;
    }

    public void setSearchUser(String searchUser) {
        this.searchUser = searchUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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
        return "UserManagement{" +
                "searchUser='" + searchUser + '\'' +
                ", userName='" + userName + '\'' +
                ", role='" + role + '\'' +
                ", status='" + status + '\'' +
                ", lastLogin='" + lastLogin + '\'' +
                ", location='" + location + '\'' +
                ", userID=" + userID +
                ", date=" + date +
                '}';
    }
}
