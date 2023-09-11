

public class Task9 {
    public static void main(String[] args) {
        System.out.println(getExp(1));

    }

    static double getExp (double x){
        double e = 0.000_0001;
        double step = 1;
        double exponenta = 1;
        int number = 1;

        while(Math.abs(step) > e){
            step *= x / number;
            exponenta += step;
            number++;
        }
        return exponenta;
    }
}
