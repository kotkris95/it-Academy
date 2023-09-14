import java.util.Arrays;


public class Task9 {
    public static void main(String[] args) {
        int[] array = new int[]{6, 8, 6, 1, 10, 9, 8, 6, 9, 11, 12, 2, 3};

            System.out.println("Исходный массив: " + Arrays.toString(array));
            int[] arrayWithoutDuplicates = removeDuplicates(array);
            System.out.println("Массив без повторяющихся элементов: "
                    + Arrays.toString(arrayWithoutDuplicates)
            );
        }

        public static int[] removeDuplicates(int[] array) {
            Arrays.sort(array);
            int k = 0;
            for (int i = 0; i < array.length; i++) {
                if (i == 0 || array[i] != array[i - 1]) {
                    array[k++] = array[i];
                }
            }
            return Arrays.copyOf(array, k);
        }
}