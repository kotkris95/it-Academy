import java.util.Arrays;


public class Task9 {
    public static void main(String[] args) {
        int[] array = new int[]{6, 8, 6, 1, 10, 9, 8, 6, 9, 11, 12, 2, 3};
        System.out.println(Arrays.toString(removeDuplicates(array)));
    }
    public static int[] removeDuplicates(int[] arr) {
        int end = arr.length;

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (arr[i] == arr[j]) {
                    int shiftLeft = j;
                    for (int k = j+1; k < end; k++, shiftLeft++) {
                        arr[shiftLeft] = arr[k];
                    }
                    end--;
                    j--;
                }
            }
        }

        int[] whitelist = new int[end];
        for(int i = 0; i < end; i++){
            whitelist[i] = arr[i];
        }
        return whitelist;
    }
}
