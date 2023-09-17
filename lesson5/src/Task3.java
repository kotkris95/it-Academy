public class Task3 {
    public static void main(String[] args) {
        int dayOfMonth =8;
        int month = 10;
        int[] year = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dayOfYear = 0;

        for (int i = 0; i <= month-2; i++) {
            if(month > year.length){
                System.out.println("Введены некорректные данные!");
            }
            dayOfYear += year[i];
        }
        dayOfYear += dayOfMonth;
        System.out.println("Порядковый номер дня года: " + dayOfYear);


    }
}
