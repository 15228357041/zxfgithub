package com.test.erp.dao.model;

import java.io.Serializable;

public class QrtzLocks implements Serializable {
    private String lockName;

    private static final long serialVersionUID = 1L;

    public String getLockName() {
        return lockName;
    }

    public void setLockName(String lockName) {
        this.lockName = lockName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lockName=").append(lockName);
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
        QrtzLocks other = (QrtzLocks) that;
        return (this.getLockName() == null ? other.getLockName() == null : this.getLockName().equals(other.getLockName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLockName() == null) ? 0 : getLockName().hashCode());
        return result;
    }
}