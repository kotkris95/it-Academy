package task2;

import java.util.*;

public class CharCount {
    public static void main(String[] args) {
        Map<Character, Integer> map = getCharsCount("baaccc");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("Ключ: \"" + entry.getKey() + "\". Количество вхождений:  " + entry.getValue());
        }

    }

    public static Map<Character, Integer> getCharsCount(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, (map.containsKey(c)) ? map.get(c) + 1 : 1);
        return map;
    }
}
