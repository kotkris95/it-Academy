public class Task7 {
    public static void main(String[] args) {
        int a = 25;
        int b = 96;
        int c = 7;
        int d = 86;
        int e = 160;

        if (a == b && b ==c && c==d && d == e){
            System.out.println("All numbers are equal");
        } else if (a > b && a > c && a > d && a > e){
            System.out.println("Maximum number is \"a\" with value  "  + a);
        } else if (b > a && b > c && b > d && b > e){
            System.out.println("Maximum number is \"b\" with value  "  + b);
        } else if(c > a && c > b && c > d && c > e){
            System.out.println("Maximum number is \"c\" with value  "  + c);
        } else if(d >a && d > b && d > c && d > e){
            System.out.println("Maximum number is \"d\" with value  "  + d);
        } else{
            System.out.println("Maximum number is \"e\" with value  "  + e);
        }


        if(a < b && a < c && a < d && a < e){
            System.out.println("Minimum number is \"a\" with value  "  + a);
        } else if(b < a && b < c && b < d && b < e){
            System.out.println("Minimum number is \"b\" with value  "  + b);
        } else if(c < a && c < b && c < d && c < e){
            System.out.println("Minimum number is \"c\" with value  "  + c);
        } else if(d < a && d < b && d < c && d < e){
            System.out.println("Minimum number is \"d\" with value  "  + d);
        } else{
            System.out.println("Minimum number is \"c\" with value  "  + c);
        }
    }
}
