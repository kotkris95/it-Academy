package test.task1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        String str = "Привет";
        Integer i = 88;
        Generic<String, Animal, Integer> generic = new Generic<>(str, animal, i);
        System.out.println("Значение переменной T: " + generic.getT());
        System.out.println("Значение переменной V: " + generic.getV());
        System.out.println("Значение переменной K: " + generic.getK());

    }
}
