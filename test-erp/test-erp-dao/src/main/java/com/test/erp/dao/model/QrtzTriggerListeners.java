package com.test.erp.dao.model;

import java.io.Serializable;

public class QrtzTriggerListeners implements Serializable {
    private String triggerName;

    private String triggerGroup;

    private String triggerListener;

    private static final long serialVersionUID = 1L;

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getTriggerGroup() {
        return triggerGroup;
    }

    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }

    public String getTriggerListener() {
        return triggerListener;
    }

    public void setTriggerListener(String triggerListener) {
        this.triggerListener = triggerListener;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", triggerName=").append(triggerName);
        sb.append(", triggerGroup=").append(triggerGroup);
        sb.append(", triggerListener=").append(triggerListener);
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
        QrtzTriggerListeners other = (QrtzTriggerListeners) that;
        return (this.getTriggerName() == null ? other.getTriggerName() == null : this.getTriggerName().equals(other.getTriggerName()))
            && (this.getTriggerGroup() == null ? other.getTriggerGroup() == null : this.getTriggerGroup().equals(other.getTriggerGroup()))
            && (this.getTriggerListener() == null ? other.getTriggerListener() == null : this.getTriggerListener().equals(other.getTriggerListener()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTriggerName() == null) ? 0 : getTriggerName().hashCode());
        result = prime * result + ((getTriggerGroup() == null) ? 0 : getTriggerGroup().hashCode());
        result = prime * result + ((getTriggerListener() == null) ? 0 : getTriggerListener().hashCode());
        return result;
    }
}