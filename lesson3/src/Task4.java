public class Task4 {
    public static void main(String[] args) {
        int a = -6;
        int b = 9;
        int x = 2;

        if(x > a && x < b){
            System.out.println("Distance from a to x = " + (x - a));
            System.out.println("Distance from x to b = " + (b - x));
        } else if (x == a){
            System.out.println("x value is the same as a. Value: " + a);
        }else if (x == b){
            System.out.println("x value is the same as b. Value: " + b);
        } else if (x < a){
            System.out.println("x doesn't belong to this segment. Distance from a to x = " + (x - a));
        } else if (x > b){
            System.out.println("x doesn't belong to this segment. Distance from b to x = " + (x - b));
        }
    }
}
