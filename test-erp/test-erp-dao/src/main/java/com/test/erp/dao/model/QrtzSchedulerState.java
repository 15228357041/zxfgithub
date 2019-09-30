package com.test.erp.dao.model;

import java.io.Serializable;

public class QrtzSchedulerState implements Serializable {
    private String instanceName;

    private Long lastCheckinTime;

    private Long checkinInterval;

    private static final long serialVersionUID = 1L;

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public Long getLastCheckinTime() {
        return lastCheckinTime;
    }

    public void setLastCheckinTime(Long lastCheckinTime) {
        this.lastCheckinTime = lastCheckinTime;
    }

    public Long getCheckinInterval() {
        return checkinInterval;
    }

    public void setCheckinInterval(Long checkinInterval) {
        this.checkinInterval = checkinInterval;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", instanceName=").append(instanceName);
        sb.append(", lastCheckinTime=").append(lastCheckinTime);
        sb.append(", checkinInterval=").append(checkinInterval);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        QrtzSchedulerState other = (QrtzSchedulerState) that;
        return (this.getInstanceName() == null ? other.getInstanceName() == null : this.getInstanceName().equals(other.getInstanceName()))
            && (this.getLastCheckinTime() == null ? other.getLastCheckinTime() == null : this.getLastCheckinTime().equals(other.getLastCheckinTime()))
            && (this.getCheckinInterval() == null ? other.getCheckinInterval() == null : this.getCheckinInterval().equals(other.getCheckinInterval()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        result = prime * result + ((getLastCheckinTime() == null) ? 0 : getLastCheckinTime().hashCode());
        result = prime * result + ((getCheckinInterval() == null) ? 0 : getCheckinInterval().hashCode());
        return result;
    }
}