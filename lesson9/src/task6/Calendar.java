package task6;


public class Calendar {
    Month[] months = Month.values();

    public void printDayOfYear(int dayOfMonth, Month month) {
        int dayOfYear = 0;
        for (int i = 0; i < month.ordinal(); i++) {
            dayOfYear += months[i].getAmountOfDays();
        }
        dayOfYear += dayOfMonth;
        System.out.println("Порядковый номер дня года, соответствующий месяцу: "
                + month.name() + " и порядковому номеру дня месяца " + dayOfMonth
                + " равен " + dayOfYear
        );
    }

    public void dayInfo(int dayOfYear) {
        Month month = Month.JANUARY;
        int dayCount = 0;
        for (Month value : months) {
            if (dayCount < dayOfYear) {
                dayCount += value.getAmountOfDays();
                month = value;
            }
        }
        int dayOfMonth = dayOfYear - (dayCount - month.getAmountOfDays());
        DayOfWeek dayOfWeek = getDayOfWeek(dayOfMonth);
        Season season = getSeason(month);
        System.out.println("Порядковый номер дня года: " + dayOfYear);
        System.out.println("Соответсвует месяцу: " + month);
        System.out.println("Порядковый номер дня месяца: " + dayOfMonth);
        System.out.println("День недели: " + dayOfWeek);
        System.out.println("Пора года: " + season);
    }

    private DayOfWeek getDayOfWeek(int dayOfMonth) {
        int count = dayOfMonth % 7;
        DayOfWeek[] daysOfWeek = DayOfWeek.values();
        if (count == 0) {
            return DayOfWeek.SUNDAY;
        }
        return daysOfWeek[count - 1];
    }

    private Season getSeason(Month month) {
        Season[] seasons = Season.values();
        Season season = null;
        for (Season value : seasons) {
            for (int j = 0; j < value.getMonths().length; j++) {
                if (month == value.getMonths()[j]) {
                    season = value;
                    break;
                }
            }
        }
        return season;
    }
}
