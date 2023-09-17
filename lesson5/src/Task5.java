

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        // Bubble Sort
        int[] array = new int[]{13, 36, 1, 6, 84, 69, 84, 64, 2, 34, 11};
        boolean needIteration = true;

        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));

        // Insertion Sort
        int[] array1 = new int[]{5, 1, 8, 10, 6, 15, 3, 6, 1, 8, 9};
        for (int left = 0; left < array1.length; left++) {
            int value = array1[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array1[i]) {
                    array1[i + 1] = array1[i];
                } else {
                    break;
                }
            }
            array1[i + 1] = value;
        }
        System.out.println(Arrays.toString(array1));

        //Selection Sort
        int[] array3 = {10, 21, 5, 33, 18, 12, 15, 36, 2};
        for (int left = 0; left < array3.length; left++) {
            int minInd = left;
            for (int i = left; i < array3.length; i++) {
                if (array3[i] < array3[minInd]) {
                    minInd = i;
                }
            }
            swap(array3, left, minInd);
        }
        System.out.println(Arrays.toString(array3));
    }

    static void swap(int[] array, int i, int i1) {
        int value = array[i];
        array[i] = array[i1];
        array[i1] = value;
    }
}
