package task3;


public class Main {
    public static void main(String[] args) {
        String[] array = {"один", "два", "три"};
        GenericArray<String> genericArray = new GenericArray<>(array);

        String newValue = "ДВА";
        int index = 1;
        System.out.println("Значение по индексу  " + index + ": " + genericArray.getValue(1));
        genericArray.changeValue(index, newValue);
        System.out.println("Новое значение по индексу  " + index + ": " + genericArray.getValue(1));

        System.out.println("Измененный массив: ");

        for (String s : genericArray) {
            System.out.print(s + " ");
        }
    }
}
