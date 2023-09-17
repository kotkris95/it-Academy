import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[][] array = new int[5][3];

        for (int[] ints : array) {
            Arrays.fill(ints, 1);
        }
        Task4.print(array);
        System.out.println();
        int[][] newArray = getNewArray(array);
        Task4.print(newArray);
    }

    static int[][] getNewArray(int[][] array) {
        int[][] newArray = new int[array[0].length][];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = getChanges(array, i);
        }
        return newArray;
    }

    static int[] getChanges(int[][] array, int value) {
        int count = 0;
        for (int[] ints : array) {
            count++;
        }
        int[] arrayOut = new int[count];
        for (int i = 0; i < arrayOut.length; i++) {
            arrayOut[i] = array[i][value];
        }
        return arrayOut;
    }
}

