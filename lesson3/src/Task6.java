public class Task6 {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = -4;
        double discr = b * 2 - 4 * a * c;
        System.out.println(discr);

        if(a==0 && b==0 && c==0){
            System.out.println("Infinity");
        } else if (discr > 0) {
            double x1 = (-b + Math.sqrt(discr)) / (2 * a);
            double x2 = (-b - Math.sqrt(discr)) / (2 * a);
            System.out.println(x1);
            System.out.println(x2);
        } else if (discr == 0) {
            double x = -b / 2 * a;
            System.out.println(x);
        } else {
            System.out.println("Корней нет");
        }

    }
}
