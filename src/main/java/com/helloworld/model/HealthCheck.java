package com.helloworld.model;

public class HealthCheck {
    private String status;
    private String version;
    private String uptime;
    private DiskSpace diskSpace;

    public HealthCheck(String status, String version, String uptime, DiskSpace diskSpace) {
        this.status = status;
        this.version = version;
        this.uptime = uptime;
        this.diskSpace = diskSpace;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }

    public DiskSpace getDiskSpace() {
        return diskSpace;
    }

    public void setDiskSpace(DiskSpace diskSpace) {
        this.diskSpace = diskSpace;
    }
}
