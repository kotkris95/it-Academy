import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {
        String text = "первая почта: i.ivanov@it-academy.by, "
                + " вторая почта: petrod-1986@yahoo.com.au, "
                + " третья почта: kotkris95@mail.ru";

        Pattern pattern = Pattern.compile("\\b[\\w\\S]+@[\\w\\S]+\\.[\\p{L}\\.]{2,6}");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
