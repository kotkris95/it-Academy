import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        String text = "dog DOG dogs Dog";
        System.out.println(text);
        String[] textArray = text.trim().toLowerCase().split("[\\s+,.:!?]+");
        int length = 0;
        String[] uniqueWords = new String[length];
        for (String s : textArray) {
            if (isUnique(s, uniqueWords)) {
                uniqueWords = Arrays.copyOf(uniqueWords, ++length);
                uniqueWords[length - 1] = s;
            }
        }
        System.out.println("Количество уникальных слов в тексте: " + uniqueWords.length);
    }

    public static boolean isUnique(String word, String[] textArray) {
        boolean b = true;
        for (String text : textArray) {
            if (text.equals(word)) {
                b = false;
                break;
            }
        }
        return b;
    }
}
