public class Task1 {
    public static void main(String[] args) {
        double [] array  = new double[10];

        for (int i = 0; i < array.length; i++){
            array[i] =  Math.random() * 10;
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Максимальный элемент массива: "+ maxInt(array));
        System.out.println("Минимальный элемент массива: "+ minInt(array));
        System.out.println("Среднее арифметическое элементов массива: "+ sumInt(array));
    }


     static double maxInt(double[] array) {
         double max = array[0];
        for (int i = 1; i <array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    static double minInt(double[] array) {
        double min = array[0];
        for (int i = 1; i <array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }

    static double sumInt(double[]array){
        double sum = array[0];
        for (int i = 1; i < array.length-1; i++) {
            sum+=array[i];
        }
        return sum/array.length;
    }
}
