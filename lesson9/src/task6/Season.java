package task6;

public enum Season {
    WINTER(new Month[]{Month.JANUARY, Month.FEBRUARY, Month.DECEMBER}),
    SPRING(new Month[]{Month.MARCH, Month.APRIL, Month.MAY}),
    SUMMER(new Month[]{Month.JUNE, Month.JULY, Month.AUGUST}),
    AUTUMN(new Month[]{Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER});

    private final Month[] months;

    Season(Month[] months) {
        this.months = months;
    }

    public Month[] getMonths() {
        return months;
    }
}
