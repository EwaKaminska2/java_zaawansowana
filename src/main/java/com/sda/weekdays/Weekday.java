package com.sda.weekdays;

public enum Weekday {
    MONDAY("PONIEDZIAŁEK", "MONDAY", false),
    TUESDAY("WTOREK", "TUESDAY", false),
    WEDNESDAY("ŚRODA", "WEDNESDAY", false),
    THURSDAY("CZWARTEK", "THURSDAY", false),
    FRIDAY("PIĄTEK", "FRIDAY", false),
    SATURDAY("SOBOTA", "SATURDAY", true),
    SUNDAY("NIEDZIELA", "SUNDAY", true);

    private    String polishName;
    private   String englishName;
    private   boolean isWeekend;




      Weekday(String polishName, String englishName, boolean isWeekend) {
        this.polishName = polishName;
        this.englishName = englishName;
        this.isWeekend = isWeekend;
    }

    public String getPolishName() {
        return polishName;
    }

    public boolean getIsWeekend() {
        return isWeekend;
    }


    public static Weekday findByPolishName(String weekDay) {
        for (Weekday day : Weekday.values()) {
            if (day.polishName.equals(weekDay)) {
                return Weekday.valueOf(day.name());
            }
        }
        throw new UnknownWeekdayException(weekDay);
    }
    public static Weekday findByEnglishName(String weekDay) {
        for (Weekday day : Weekday.values()) {
            if (day.englishName.equals(weekDay)) {
                return Weekday.valueOf(day.name());
            }
        }
        throw new UnknownWeekdayException(weekDay);
    }

}
