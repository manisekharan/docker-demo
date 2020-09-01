package com.helloworld.model;

public class DiskSpace {
    private long total;
    private long free;
    private long threshold;

    public DiskSpace(long total, long free, long threshold) {
        this.total = total;
        this.free = free;
        this.threshold = threshold;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getFree() {
        return free;
    }

    public void setFree(long free) {
        this.free = free;
    }

    public long getThreshold() {
        return threshold;
    }

    public void setThreshold(long threshold) {
        this.threshold = threshold;
    }
}
