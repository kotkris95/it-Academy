import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[]{2, 6, 1, 9, 1, 8, 4, 9, 3, 7, 1};

        System.out.println(Arrays.toString(array));
        int min = array[0];
        int max = array[0];

        for (int j : array) {
            if (j < min) {
                min = j;
            } else if (j > max) {
                max = j;
            }
        }
        int [] indexOfMinNumbers = new int[homManyNumbers(array, min)];
        int [] indexOfMaxNumbers = new int[homManyNumbers(array, max)];

        indexOfMinNumbers = getIndexNumbers(array, indexOfMinNumbers, min);
        indexOfMaxNumbers = getIndexNumbers(array, indexOfMaxNumbers, max);

        int swap = array[indexOfMaxNumbers[0]];
        array[indexOfMaxNumbers[0]]=array[indexOfMinNumbers[indexOfMinNumbers.length-1]];
        array[indexOfMinNumbers[indexOfMinNumbers.length-1]]=swap;

        System.out.println(Arrays.toString(array));
    }
    static int[] getIndexNumbers(int [] array, int []indexOfNumbers, int value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==value){
                indexOfNumbers[count] = i;
                count++;
            }
        }
        return indexOfNumbers;
    }
    static int homManyNumbers(int[]array, int number){
        int howManyNumbers = 0;
        for (int element : array) {
            if (element == number) {
                howManyNumbers++;
            }
        }
        return howManyNumbers;
    }
}
