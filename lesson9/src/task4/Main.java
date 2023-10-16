package task4;

public class Main {
    public static void main(String[] args) {
        Integer[][] array = {
                {1, 2, 3, 4},
                {3, 2, 1},
                {1, 2, 3, 4, 5}
        };
        IteratorArray<Integer> iteratorArray = new IteratorArray<>(array);
        while (iteratorArray.hasNext()) {
            System.out.println(iteratorArray.next());
        }
    }
}
