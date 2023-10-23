package task1;

import java.util.*;

public class ArrayToMap {
    public static void main(String[] args) {
        String[] array = new String[]{
                "привет",
                "пока",
                "привет",
                "привет",
                "пока",
                "ок"
        };
        Map <String, Integer> map = arrayToMap(array);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Ключ: \"" + entry.getKey() + "\". Количество вхождений:  " + entry.getValue());
        }
    }

    public static <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> map = new HashMap<>();
        for (K k : ks) {
            map.put(k, Collections.frequency(List.of(ks), k));
        }
        return map;
    }
}
