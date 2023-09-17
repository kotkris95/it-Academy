import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[]{6, 10, 9, 4, 8, 14, 5, 11, 6, 7};
        int[][] twoDimensionalArray = new int[array.length][];

        for (int i = 0; i < array.length; i++) {
            twoDimensionalArray[i] = getGreaterValues(array, array[i]);
        }
        print(twoDimensionalArray);
    }

    static int[] getGreaterValues(int[] array, int value) {
        int count = 0;
        int lengthOfArray = getLengthOfArray(array, value);
        int[] twoDimensionalArray = new int[lengthOfArray];

        for (int j : array) {
            if (j > value) {
                twoDimensionalArray[count] = j;
                count++;
            }
        }
        return twoDimensionalArray;
    }

    static int getLengthOfArray(int[] array, int value) {
        int count = 0;
        for (int j : array) {
            if (j > value) {
                count++;
            }
        }
        return count;
    }

    static void print(int[][] array) {
        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }
    }
}

