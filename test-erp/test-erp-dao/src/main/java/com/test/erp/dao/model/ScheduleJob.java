package com.test.erp.dao.model;

import java.io.Serializable;
import java.util.Date;

public class ScheduleJob implements Serializable {
    /**
     * 任务调度参数key
     */
    public static final String JOB_PARAM_KEY = "JOB_PARAM_KEY";

    /**
     * 定时任务状态
     *
     * @author xuchangda
     * @email changdaxu@foxmail.com
     * @date 2016年12月3日 上午12:07:22
     */
    public enum ScheduleStatus {
        /**
         * 正常
         */
        NORMAL(true),
        /**
         * 暂停
         */
        PAUSE(false);

        private Boolean value;

        private ScheduleStatus(Boolean value) {
            this.value = value;
        }

        public Boolean getValue() {
            return value;
        }
    }

    /**
     * 任务id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * spring bean名称
     *
     * @mbg.generated
     */
    private String jobBeanName;

    /**
     * 方法名
     *
     * @mbg.generated
     */
    private String jobMethodName;

    /**
     * 参数
     *
     * @mbg.generated
     */
    private String jobParams;

    /**
     * cron表达式
     *
     * @mbg.generated
     */
    private String jobCronExpression;

    /**
     * 任务状态  0：正常  1：暂停
     *
     * @mbg.generated
     */
    private Boolean jobStatus;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String jobRemark;

    private String createBy;

    private Date createDate;

    private String updateBy;

    private Date updateDate;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobBeanName() {
        return jobBeanName;
    }

    public void setJobBeanName(String jobBeanName) {
        this.jobBeanName = jobBeanName;
    }

    public String getJobMethodName() {
        return jobMethodName;
    }

    public void setJobMethodName(String jobMethodName) {
        this.jobMethodName = jobMethodName;
    }

    public String getJobParams() {
        return jobParams;
    }

    public void setJobParams(String jobParams) {
        this.jobParams = jobParams;
    }

    public String getJobCronExpression() {
        return jobCronExpression;
    }

    public void setJobCronExpression(String jobCronExpression) {
        this.jobCronExpression = jobCronExpression;
    }

    public Boolean getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(Boolean jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getJobRemark() {
        return jobRemark;
    }

    public void setJobRemark(String jobRemark) {
        this.jobRemark = jobRemark;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", jobBeanName=").append(jobBeanName);
        sb.append(", jobMethodName=").append(jobMethodName);
        sb.append(", jobParams=").append(jobParams);
        sb.append(", jobCronExpression=").append(jobCronExpression);
        sb.append(", jobStatus=").append(jobStatus);
        sb.append(", jobRemark=").append(jobRemark);
        sb.append(", createBy=").append(createBy);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateDate=").append(updateDate);
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
        ScheduleJob other = (ScheduleJob) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getJobBeanName() == null ? other.getJobBeanName() == null : this.getJobBeanName().equals(other.getJobBeanName()))
            && (this.getJobMethodName() == null ? other.getJobMethodName() == null : this.getJobMethodName().equals(other.getJobMethodName()))
            && (this.getJobParams() == null ? other.getJobParams() == null : this.getJobParams().equals(other.getJobParams()))
            && (this.getJobCronExpression() == null ? other.getJobCronExpression() == null : this.getJobCronExpression().equals(other.getJobCronExpression()))
            && (this.getJobStatus() == null ? other.getJobStatus() == null : this.getJobStatus().equals(other.getJobStatus()))
            && (this.getJobRemark() == null ? other.getJobRemark() == null : this.getJobRemark().equals(other.getJobRemark()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getJobBeanName() == null) ? 0 : getJobBeanName().hashCode());
        result = prime * result + ((getJobMethodName() == null) ? 0 : getJobMethodName().hashCode());
        result = prime * result + ((getJobParams() == null) ? 0 : getJobParams().hashCode());
        result = prime * result + ((getJobCronExpression() == null) ? 0 : getJobCronExpression().hashCode());
        result = prime * result + ((getJobStatus() == null) ? 0 : getJobStatus().hashCode());
        result = prime * result + ((getJobRemark() == null) ? 0 : getJobRemark().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        return result;
    }
}