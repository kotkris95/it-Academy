public class Task6 {
    public static void main(String[] args) {
        for(int i = 20; i <=30; i++){
            int oddNumber;
            int number = i;
            System.out.print(i + " ");
            do{
                if(number % 2 == 0){
                    number /=2;
                    System.out.print(number + "  ");
                } else {
                    oddNumber = (number * 3 + 1) / 2;
                    number = oddNumber;
                    System.out.print(number + "  ");
                }
            }while(number != 1);
            System.out.println();
        }
    }
}
