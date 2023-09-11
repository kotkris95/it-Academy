public class Task8 {
    public static void main(String[] args) {
        for(int i = 1; i<=10000; i++){
            if( i == getSumOfDivisors(i)){
                System.out.print(i + " ");
            }
        }
    }
    static int getSumOfDivisors(int number){
        int sumOfDivisors=0;
        int divisor =  1;
        for(int i = number-1; i>0; i--){
            if(i % divisor == 0){
                sumOfDivisors+=divisor;
            }
            divisor++;
        }
        return sumOfDivisors;
    }
}
