package com.test.erp.dao.model;

import java.io.Serializable;
import java.util.Arrays;

public class QrtzJobDetails implements Serializable {
    private String jobName;

    private String jobGroup;

    private String description;

    private String jobClassName;

    private String isDurable;

    private String isVolatile;

    private String isStateful;

    private String requestsRecovery;

    private byte[] jobData;

    private static final long serialVersionUID = 1L;

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJobClassName() {
        return jobClassName;
    }

    public void setJobClassName(String jobClassName) {
        this.jobClassName = jobClassName;
    }

    public String getIsDurable() {
        return isDurable;
    }

    public void setIsDurable(String isDurable) {
        this.isDurable = isDurable;
    }

    public String getIsVolatile() {
        return isVolatile;
    }

    public void setIsVolatile(String isVolatile) {
        this.isVolatile = isVolatile;
    }

    public String getIsStateful() {
        return isStateful;
    }

    public void setIsStateful(String isStateful) {
        this.isStateful = isStateful;
    }

    public String getRequestsRecovery() {
        return requestsRecovery;
    }

    public void setRequestsRecovery(String requestsRecovery) {
        this.requestsRecovery = requestsRecovery;
    }

    public byte[] getJobData() {
        return jobData;
    }

    public void setJobData(byte[] jobData) {
        this.jobData = jobData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", jobName=").append(jobName);
        sb.append(", jobGroup=").append(jobGroup);
        sb.append(", description=").append(description);
        sb.append(", jobClassName=").append(jobClassName);
        sb.append(", isDurable=").append(isDurable);
        sb.append(", isVolatile=").append(isVolatile);
        sb.append(", isStateful=").append(isStateful);
        sb.append(", requestsRecovery=").append(requestsRecovery);
        sb.append(", jobData=").append(jobData);
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
        QrtzJobDetails other = (QrtzJobDetails) that;
        return (this.getJobName() == null ? other.getJobName() == null : this.getJobName().equals(other.getJobName()))
            && (this.getJobGroup() == null ? other.getJobGroup() == null : this.getJobGroup().equals(other.getJobGroup()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getJobClassName() == null ? other.getJobClassName() == null : this.getJobClassName().equals(other.getJobClassName()))
            && (this.getIsDurable() == null ? other.getIsDurable() == null : this.getIsDurable().equals(other.getIsDurable()))
            && (this.getIsVolatile() == null ? other.getIsVolatile() == null : this.getIsVolatile().equals(other.getIsVolatile()))
            && (this.getIsStateful() == null ? other.getIsStateful() == null : this.getIsStateful().equals(other.getIsStateful()))
            && (this.getRequestsRecovery() == null ? other.getRequestsRecovery() == null : this.getRequestsRecovery().equals(other.getRequestsRecovery()))
            && (Arrays.equals(this.getJobData(), other.getJobData()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getJobName() == null) ? 0 : getJobName().hashCode());
        result = prime * result + ((getJobGroup() == null) ? 0 : getJobGroup().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getJobClassName() == null) ? 0 : getJobClassName().hashCode());
        result = prime * result + ((getIsDurable() == null) ? 0 : getIsDurable().hashCode());
        result = prime * result + ((getIsVolatile() == null) ? 0 : getIsVolatile().hashCode());
        result = prime * result + ((getIsStateful() == null) ? 0 : getIsStateful().hashCode());
        result = prime * result + ((getRequestsRecovery() == null) ? 0 : getRequestsRecovery().hashCode());
        result = prime * result + (Arrays.hashCode(getJobData()));
        return result;
    }
}