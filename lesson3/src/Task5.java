public class Task5 {
    public static void main(String[] args) {
        int x = -9;
        int y = 3;

        if(x>0 && y>0){
            System.out.println("Quarter I");
        } else if(x<0 && y>0){
            System.out.println("Quarter II");
        } else if(x<0 && y<0){
            System.out.println("Quarter III");
        } else if(x>0 && y<0){
            System.out.println("Quarter IV");
        } else {
            System.out.println("Point lies on the axis");
        }
    }
}
