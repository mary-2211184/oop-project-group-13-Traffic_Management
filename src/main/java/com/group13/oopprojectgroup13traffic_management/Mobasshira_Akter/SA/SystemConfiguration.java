package com.group13.oopprojectgroup13traffic_management.Mobasshira_Akter.SA;

public class SystemConfiguration {
    private String defaultLanguage;
    private int loginTimeout,maxLoginAttempt,enterNewValue;

    public SystemConfiguration(String defaultLanguage, int loginTimeout, int maxLoginAttempt, int enterNewValue) {
        this.defaultLanguage = defaultLanguage;
        this.loginTimeout = loginTimeout;
        this.maxLoginAttempt = maxLoginAttempt;
        this.enterNewValue = enterNewValue;
    }


    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    public void setDefaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }

    public int getLoginTimeout() {
        return loginTimeout;
    }

    public void setLoginTimeout(int loginTimeout) {
        this.loginTimeout = loginTimeout;
    }

    public int getMaxLoginAttempt() {
        return maxLoginAttempt;
    }

    public void setMaxLoginAttempt(int maxLoginAttempt) {
        this.maxLoginAttempt = maxLoginAttempt;
    }

    public int getEnterNewValue() {
        return enterNewValue;
    }

    public void setEnterNewValue(int enterNewValue) {
        this.enterNewValue = enterNewValue;
    }

    @Override
    public String toString() {
        return "SystemConfiguration{" +
                "defaultLanguage='" + defaultLanguage + '\'' +
                ", loginTimeout=" + loginTimeout +
                ", maxLoginAttempt=" + maxLoginAttempt +
                ", enterNewValue=" + enterNewValue +
                '}';
    }
}
