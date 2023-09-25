package task6;

public class DaysOfWeek {
    public static String getDayOfWeek(int day) {
        String s = null;
        switch (day) {
            case 0:
                s = "в понедельник";
                break;
            case 1:
                s = "во вторник";
                break;
            case 2:
                s = "в среду";
                break;
            case 3:
                s = "в четверг";
                break;
            case 4:
                s = "в пятницу";
                break;
            case 5:
                s = "в субботу";
                break;
            case 6:
                s = "в воскресение";
                break;
        }
        return s;
    }
}
