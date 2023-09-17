import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[]{2, 6, 1, 9, 1, 8, 4, 9, 3, 7, 1};
        System.out.println(Arrays.toString(array));

        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]){
                maxIndex = i;
            }
            if (array[i] <= array[minIndex]) {
                minIndex = i;
            }
        }

        int tmp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = tmp;

        System.out.println(Arrays.toString(array));
    }
}
