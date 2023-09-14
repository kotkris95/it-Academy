public class Task3 {
    public static void main(String[] args) {
        int dayOfMonth =8;
        int month = 10;
        int [][] year = new int[12][];
        int [][] initYear = initialization(year);
        int dayOfYear = getDayOfYear(initYear, month, dayOfMonth);
        System.out.println("Порядковый номер дня года: " + dayOfYear);
    }
    static int getDayOfYear(int[][] year, int month, int dayOfMonth) {
        int dayOfYear = 0;
        if(month > 0 && month < 13 && dayOfMonth>0 && dayOfMonth < 32) {
            for (int i = 0; i < month - 1; i++) {
                for (int j = 0; j < year[i].length; j++) {
                    dayOfYear++;
                }
            }
        }else{
            System.out.println("Введены некорректные данные!");
            return 0;
        }
        return dayOfYear+=dayOfMonth;
    }

    static int [][] initialization(int [][] year) {
        for (int i = 0; i < year.length; i++) {
            year[i] = getDaysOfMonth(i);
        }
        return year;
    }

    static int[] getDaysOfMonth(int month) {
        if(month > 11 || month < 0){
            System.out.println("Переменная month некорректно инициализирована!");
        }
        int[] daysOfMonth = new int[0];
        if(month == 0 || month == 2 || month == 4 || month == 6 || month == 7 || month == 9 || month == 11){
            daysOfMonth = new int[31];
        } else if(month==1){
            daysOfMonth = new int[28];
        } else {
            daysOfMonth = new int[30];
        }

        for(int i = 0; i < daysOfMonth.length; i++){
            daysOfMonth[i] = i+1;
        }
        return daysOfMonth;
    }
}
