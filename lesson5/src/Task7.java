import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int [] array = new int []{5, 10, 26, 7, 65, 95 , 25, 1 , 16, 75};
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Медианное значение массива: " + getMediumValue(array));


    }
    static int getMediumValue (int [] array){
        Arrays.sort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
        if(array.length % 2 == 1){
            return array.length/2;
        } else{
            return  ((array[array.length / 2 - 1] + array[array.length / 2])/2);
        }
    }
}
