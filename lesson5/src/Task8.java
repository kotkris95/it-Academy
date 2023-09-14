public class Task8 {
    public static void main(String[] args) {
        int [][] array = new int [7][7];
        int dioganal = 0;
        int inversDioganal = array.length-1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(j == dioganal || j == inversDioganal){
                    array[i][j] = 0;
                }else if(j>dioganal && j < inversDioganal || j<dioganal && j>inversDioganal){
                    array[i][j] = (int) ((Math.random()+0.1) * 10);
                }else {
                    array[i][j] = (int) ((Math.random()+0.1) * -10);
                }
            }
            dioganal++;
            inversDioganal--;
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum+=array[i][j];
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
        System.out.println("Сумма всех элементов массива: " + sum);
        System.out.println("Среднее арифметическое всех элементов больше " + sum + ": "
                + getSum(array, sum)
        );

    }
    static double getSum (int[][] array, int value){
        double sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j]>value){
                    sum+=array[i][j];
                    count++;
            }
        }
    }
        return sum/count;
    }
}
