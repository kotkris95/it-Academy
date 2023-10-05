public class Task4 {
    public static void main(String[] args) {
        String text = "Этот    текст       написан    c  пробелами   (в   знаниях).    ";
        System.out.println(text.replaceAll("\\s+", " "));
    }
}
