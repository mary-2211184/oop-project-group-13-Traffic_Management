package com.group13.oopprojectgroup13traffic_management.Rafi;

import java.io.Serializable;

public class user_main_model implements Serializable {
    private static final long serialVersionUID = 1L;
    private String userID;
    private String user_name;
    private String user_password;
    private String user_NID;
    private String drive_licenses;
    private String user_phn;

    public user_main_model(String userID, String user_name, String user_password,
                           String user_NID, String drive_licenses, String user_phn) {
        this.userID = userID;
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_NID = user_NID;
        this.drive_licenses = drive_licenses;
        this.user_phn = user_phn;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_NID() {
        return user_NID;
    }

    public void setUser_NID(String user_NID) {
        this.user_NID = user_NID;
    }

    public String getDrive_licenses() {
        return drive_licenses;
    }

    public void setDrive_licenses(String drive_licenses) {
        this.drive_licenses = drive_licenses;
    }

    public String getUser_phn() {
        return user_phn;
    }

    public void setUser_phn(String user_phn) {
        this.user_phn = user_phn;
    }

    @Override
    public String toString() {
        return "user_main_model{" +
                "userID='" + userID + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_NID='" + user_NID + '\'' +
                ", drive_licenses='" + drive_licenses + '\'' +
                ", user_phn='" + user_phn + '\'' +
                '}';
    }
}
