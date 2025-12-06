package com.group13.oopprojectgroup13traffic_management.Mobasshira_Akter.SA;

public class SecurityManagement {
    private String securityType,status,riskLevel;

    public SecurityManagement(String securityType, String status, String riskLevel) {
        this.securityType = securityType;
        this.status = status;
        this.riskLevel = riskLevel;
    }

    public String getSecurityType() {
        return securityType;
    }

    public void setSecurityType(String securityType) {
        this.securityType = securityType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    @Override
    public String toString() {
        return "SecurityManagement{" +
                "securityType='" + securityType + '\'' +
                ", status='" + status + '\'' +
                ", riskLevel='" + riskLevel + '\'' +
                '}';
    }
}
