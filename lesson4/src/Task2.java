public class Task2 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 32; i <= 126; i++){
            if(count <4){
                System.out.printf("%3d : %s   ",i, (char) i);
                count++;
            } else {
                System.out.printf("%3d : %2s   ",i, (char) i);
                System.out.println();
                count = 0;
            }
        }

    }
}
