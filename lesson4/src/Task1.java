public class Task1 {
    public static void main(String[] args) {
        int number = 50;
        int count = 0;

        while(number<90){
            if(getPrimeNumber(number) == 2){
                count++;
                if(count == 3){
                    System.out.println(number);
                    break;
                }
            }
            number++;
        }
    }
    static int getPrimeNumber(int number){
        int count = 1;
        for (int i = 2; i<=number; i++){
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
}
