package com.group13.oopprojectgroup13traffic_management.Rafi;

import java.io.Serializable;

public class PublicTransportCoordinatorModel extends user_main_model implements Serializable {
    private static final long serialVersionUID = 1L;
    private String accountType = "Public transport coordinator";

    public PublicTransportCoordinatorModel(String userID, String user_name, String user_password,
                                           String user_NID, String drive_licenses, String user_phn) {
        super(userID, user_name, user_password, user_NID, drive_licenses, user_phn);
    }

    public String getAccountType() {
        return accountType;
    }
}