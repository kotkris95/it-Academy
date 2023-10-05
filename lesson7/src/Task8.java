import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] args) {
        String[] datesArray = new String[]{
                "До 8.00 06.03.2023",
                ("До 08,00 06,03,2023"),
                ("До 09:00 06.03.2023"),
                ("До 11-00ч 07.03.2022г"),
                ("До 07.03.2023 09:00"),
                ("До 12 ч. 00 мин. 09.03.2023."),
                ("До 09:00 ч. 07.03.2023"),
                ("До 10.00,. 06.03.2023г."),
                ("До 8.00 06.03.23"),
                ("до 12:00 03.03.2023"),
                ("до 2568425")
        };
        for (String s : datesArray) {
            Pattern pattern = Pattern.compile("[\\d\\S]{8,10}");
            Matcher matcher = pattern.matcher(s);
            Pattern pattern1 = Pattern.compile("[\\d\\S]{4,5}");
            Matcher matcher1 = pattern1.matcher(s);
            Pattern pattern2 = Pattern.compile("\\d+\\s*ч.*\\d+\\s*мин\\s*[\\d\\.]+");
            Matcher matcher2 = pattern2.matcher(s);
            if (matcher2.find()) {
                String[] array = s.split(" ");
                String date = array[5].substring(0, array[5].length() - 1) + " " + array[1] + ":" + array[3];
                System.out.println(date);
            } else if (matcher.find() && matcher1.find()) {
                String date = s.substring(matcher.start(),
                        matcher.end()).replaceAll("\\W", ".").replace(".23", ".2023");
                String time = s.substring(matcher1.start(),
                        matcher1.end()).replaceAll("\\W", ":");
                System.out.println(date + " " + time);
            } else System.out.println("Данные некорректны: " + s);
        }
    }
}
