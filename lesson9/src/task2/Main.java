package task2;

import task2.pair.Pair;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Привет!", 88);
        String str = pair.getT();
        int i = pair.getE();
        System.out.println("Значение переменной типа Т: " + str);
        System.out.println("Значение переменной типа E: " + i);

        System.out.println("Новая пара с измененный местами значениями: " + pair.swap());

        String newStr = "Hello!";
        int newI = 66;
        pair.replaceLast(newI);
        pair.replaceFirst(newStr);
        System.out.println("Значение первого элемента изменено на: " + pair.getT());
        System.out.println("Значение второго элемента изменено на: " + pair.getE());
    }
}
