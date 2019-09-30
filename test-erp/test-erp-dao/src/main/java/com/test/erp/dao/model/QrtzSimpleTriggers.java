package com.test.erp.dao.model;

import java.io.Serializable;

public class QrtzSimpleTriggers implements Serializable {
    private String triggerName;

    private String triggerGroup;

    private Long repeatCount;

    private Long repeatInterval;

    private Long timesTriggered;

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

    public Long getRepeatCount() {
        return repeatCount;
    }

    public void setRepeatCount(Long repeatCount) {
        this.repeatCount = repeatCount;
    }

    public Long getRepeatInterval() {
        return repeatInterval;
    }

    public void setRepeatInterval(Long repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    public Long getTimesTriggered() {
        return timesTriggered;
    }

    public void setTimesTriggered(Long timesTriggered) {
        this.timesTriggered = timesTriggered;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", triggerName=").append(triggerName);
        sb.append(", triggerGroup=").append(triggerGroup);
        sb.append(", repeatCount=").append(repeatCount);
        sb.append(", repeatInterval=").append(repeatInterval);
        sb.append(", timesTriggered=").append(timesTriggered);
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
        QrtzSimpleTriggers other = (QrtzSimpleTriggers) that;
        return (this.getTriggerName() == null ? other.getTriggerName() == null : this.getTriggerName().equals(other.getTriggerName()))
            && (this.getTriggerGroup() == null ? other.getTriggerGroup() == null : this.getTriggerGroup().equals(other.getTriggerGroup()))
            && (this.getRepeatCount() == null ? other.getRepeatCount() == null : this.getRepeatCount().equals(other.getRepeatCount()))
            && (this.getRepeatInterval() == null ? other.getRepeatInterval() == null : this.getRepeatInterval().equals(other.getRepeatInterval()))
            && (this.getTimesTriggered() == null ? other.getTimesTriggered() == null : this.getTimesTriggered().equals(other.getTimesTriggered()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTriggerName() == null) ? 0 : getTriggerName().hashCode());
        result = prime * result + ((getTriggerGroup() == null) ? 0 : getTriggerGroup().hashCode());
        result = prime * result + ((getRepeatCount() == null) ? 0 : getRepeatCount().hashCode());
        result = prime * result + ((getRepeatInterval() == null) ? 0 : getRepeatInterval().hashCode());
        result = prime * result + ((getTimesTriggered() == null) ? 0 : getTimesTriggered().hashCode());
        return result;
    }
}