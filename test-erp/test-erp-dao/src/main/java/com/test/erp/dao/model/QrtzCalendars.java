package com.test.erp.dao.model;

import java.io.Serializable;
import java.util.Arrays;

public class QrtzCalendars implements Serializable {
    private String calendarName;

    private byte[] calendar;

    private static final long serialVersionUID = 1L;

    public String getCalendarName() {
        return calendarName;
    }

    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName;
    }

    public byte[] getCalendar() {
        return calendar;
    }

    public void setCalendar(byte[] calendar) {
        this.calendar = calendar;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", calendarName=").append(calendarName);
        sb.append(", calendar=").append(calendar);
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
        QrtzCalendars other = (QrtzCalendars) that;
        return (this.getCalendarName() == null ? other.getCalendarName() == null : this.getCalendarName().equals(other.getCalendarName()))
            && (Arrays.equals(this.getCalendar(), other.getCalendar()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCalendarName() == null) ? 0 : getCalendarName().hashCode());
        result = prime * result + (Arrays.hashCode(getCalendar()));
        return result;
    }
}