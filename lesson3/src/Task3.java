public class Task3 {
    public static void main(String[] args) {
        int a = 12;
        int b = 8;
        int c = 6;

        if(a+b>c && a+c>b && c+b>a){
            System.out.println("It's possible to construct a triangle");
        } else {
            System.out.println("It's not possible to construct a triangle");
        }

    }
}
