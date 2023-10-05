

public class Task1 {
    public static void main(String[] args) {
        String text = "Муха! О, муха! Велика аки лев! Ах, ум! О ах, ум!";

        if (isPalindrom(text)) {
            System.out.println("Строка \"" + text + "\" является палиндромом.");
        } else {
            System.out.println("Строка \"" + text + "\" не является палиндромом.");
        }
    }

    public static boolean isPalindrom(String text) {
        String s = text.toLowerCase().replaceAll("\\s", "").replaceAll("[-.?!,:]", "").toLowerCase().trim();
        StringBuilder sb = new StringBuilder(text);
        text = sb.reverse().toString().replaceAll("\\s", "").replaceAll("[-.?!,:]", "").toLowerCase().trim();
        return text.equals(s);
    }
}
