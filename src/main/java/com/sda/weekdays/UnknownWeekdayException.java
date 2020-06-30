package com.sda.weekdays;

public class UnknownWeekdayException extends RuntimeException{

    private final String weekDay;

    public UnknownWeekdayException(String weekDay) {
        this.weekDay = weekDay;
    }

    public String getWeekDay() {
        return weekDay; }
}
