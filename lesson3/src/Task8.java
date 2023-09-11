public class Task8 {
    public static void main(String[] args) {
        int dayOfYear = 360;
        int  numberOfMonth = dayOfYear / 28 + 1;
        int dayOfMonth = dayOfYear%28;
        int dayOfWeek = dayOfYear%7;

        if(dayOfYear > 364 && dayOfYear < 0) {
            System.out.println("Not a day of the year!");
        } else {
            System.out.println("The " + dayOfMonth + "th " + getMonth(numberOfMonth) + ", "
                    + getDayOfWeek(dayOfWeek) + ".");
            System.out.println(getWeekendOrWeekday(dayOfWeek));
        }

        int numberOfMonth1 = 13;
        int dayOfMonth1 = 24;
        int dayOfWeek1 = dayOfMonth1%7;
        if(dayOfMonth1 > 28){
            System.out.println("Not a day of the month!");
        } else {
            System.out.println("The " + dayOfMonth1 + "th " + getMonth(numberOfMonth1) + ", "
                    + getDayOfWeek(dayOfWeek1) + ".");
            System.out.println(getWeekendOrWeekday(dayOfWeek1));
        }
    }
    static String getMonth (int numberOfMonth){
        String month = null;
        switch(numberOfMonth){
            case(1):
                month = "of January";
                break;
            case(2):
                month = "of February";
                break;
            case(3):
                month = "of March";
                break;
            case(4):
                month = "of April";
                break;
            case(5):
                month = "of May";
                break;
            case(6):
                month = "of June";
                break;
            case(7):
                month = "of July";
                break;
            case(8):
                month = "of August";
                break;
            case(9):
                month = "of September";
                break;
            case(10):
                month = "of October";
                break;
            case(11):
                month = "of November";
                break;
            case(12):
                month = "of December";
                break;
            case(13):
                month = "of Bredyabr";
                break;
        }
        return month;
    }
    static String getDayOfWeek(int dayOfWeek){
        String day = null;
        switch (dayOfWeek){
            case(1):
                day = "Monday";
                break;
            case(2):
                day = "Tuesday";
                break;
            case(3):
                day = "Wednesday";
                break;
            case(4):
                day = "Thursday";
                break;
            case(5):
                day = "Friday";
                break;
            case(6):
                day = "Saturday";
                break;
            case(0):
                day = "Sunday";
                break;
            default:
                day = "Not a day of the week!";
        }
        return day;
    }

    static String getWeekendOrWeekday (int dayOfWeek){
        String day = null;
        switch (dayOfWeek){
            case (1):
            case (2):
            case (3):
            case (4):
            case (5):
                day = "It's a weekday!";
                break;
            case (6):
            case (0):
                day = "It's a weekend!";
                break;
            default:
                day = "Not a day of the week!";
        }
        return day;

    }
}
