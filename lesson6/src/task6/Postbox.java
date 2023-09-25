package task6;

import java.util.Arrays;

public class Postbox {
    int[] emptyMail = new int[(int) (Math.random() * 8)];

    public Postbox() {
        initEmptyMail();
    }

    public int[] initEmptyMail() {
        for (int i = 0; i < emptyMail.length; i++) {
            emptyMail[i] = (int) (Math.random() * 7);
            checkArray(i, emptyMail);
        }
        Arrays.sort(emptyMail);
        return emptyMail;
    }

    void checkArray(int index, int[] emptyMail) {
        for (int b = index - 1; b > -1; b--) {
            while (emptyMail[index] == emptyMail[b]) {
                emptyMail[index] = (int) (Math.random() * 7);
                checkArray(index, emptyMail);
            }
        }
    }


    public boolean addNewspaper() {
        String text = "Нет почты";
        int count = 0;
        for (int i = 0; i < 7; i++) {
            for (int m = 0; m < emptyMail.length; m++) {
                if (i == m) {
                    count = 0;
                }
            }

            if (i < 5) {
                if (count >= 3) {
                    text = "почтовый ящик заполнен " + DaysOfWeek.getDayOfWeek(i);
                    break;
                }
                if (isSubscribe(Newspaper.allNewspapers[i])) {
                    count++;
                }
            }
            text = "почту забирают вовремя.";
        }
        System.out.println(text);
        return true;
    }

    public boolean isSubscribe(Newspaper newspaper) {
        for (int i = 0; i < Apartment.newspapers.length; i++) {
            if (Apartment.newspapers[i].equals(newspaper)) {
                return true;
            }
        }
        return false;
    }
}
