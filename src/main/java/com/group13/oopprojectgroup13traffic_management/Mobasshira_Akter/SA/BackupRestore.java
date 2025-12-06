package com.group13.oopprojectgroup13traffic_management.Mobasshira_Akter.SA;

public class BackupRestore {
    private String backupOptions,backupType;

    public BackupRestore(String backupOptions, String backupType) {
        this.backupOptions = backupOptions;
        this.backupType = backupType;
    }

    public String getBackupOptions() {
        return backupOptions;
    }

    public void setBackupOptions(String backupOptions) {
        this.backupOptions = backupOptions;
    }

    public String getBackupType() {
        return backupType;
    }

    public void setBackupType(String backupType) {
        this.backupType = backupType;
    }

    @Override
    public String toString() {
        return "BackupRestore{" +
                "backupOptions='" + backupOptions + '\'' +
                ", backupType='" + backupType + '\'' +
                '}';
    }
}
