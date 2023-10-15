
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String text = "Да, человек смертен, но это было бы еще, полбеды. " +
                "Плохо то, что он иногда внезапно смертен, вот в чем фокус! " +
                "И вообще не может сказать, что он будет делать в сегодняшний вечер.";
        String[] textArray = getText(text);
        print(textArray);
    }

    private static void print(String[] textArray) {
        for (String word : textArray) {
            System.out.print(word + " ");
        }
    }

    public static String[] getText(String text) {
        String[] textArray = text.toLowerCase().split(" ");

        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i].length() > 1) {
                if (isEndsPunctuation(textArray[i])) {
                    if (startsEqualsEndsWithPunct(textArray[i])) {
                        textArray[i] = textArray[i].substring(0, 1).toLowerCase()
                                + textArray[i].substring(1, textArray[i].length() - 2).toUpperCase()
                                + textArray[i].substring(textArray[i].length() - 2).toLowerCase();
                        continue;
                    }
                }
                if (startsEqualsEnds(textArray[i])) {
                    textArray[i] = textArray[i].substring(0, 1).toLowerCase()
                            + textArray[i].substring(1, textArray[i].length() - 1).toUpperCase()
                            + textArray[i].substring(textArray[i].length() - 1).toLowerCase();

                    continue;
                }
            }
            if (isStartsWithVowels(textArray[i])) {
                textArray[i] = textArray[i].substring(0, 1).toUpperCase() + textArray[i].substring(1);
            } else {
                if (isEndsPunctuation(textArray[i])) {
                    String endUpper = textArray[i].substring(textArray[i].length() - 2).toUpperCase();
                    textArray[i] = textArray[i].substring(0, textArray[i].length() - 2) + endUpper;
                } else {
                    String endUpper = textArray[i].substring(textArray[i].length() - 1).toUpperCase();
                    textArray[i] = textArray[i].substring(0, textArray[i].length() - 1) + endUpper;
                }
            }
        }
        return textArray;
    }

    public static boolean isStartsWithVowels(String word) {
        boolean b = false;
        char[] vowels = new char[]{'у', 'е', 'ы', 'а', 'о', 'э', 'я', 'и', 'ю'};
        for (char vowel : vowels) {
            if (vowel == word.charAt(0)) {
                b = true;
                break;
            }
        }
        return b;
    }

    public static boolean isEndsPunctuation(String word) {
        Pattern pattern = Pattern.compile("[,.:!?]+");
        Matcher matcher = pattern.matcher(word);
        return matcher.find();
    }

    public static boolean startsEqualsEndsWithPunct(String word) {
        return word.charAt(0) == word.charAt(word.length() - 2);
    }

    public static boolean startsEqualsEnds(String word) {
        return word.charAt(0) == word.charAt(word.length() - 1);
    }
}
