package task1;

import java.util.LinkedList;
import java.util.List;

public class OutOfMemoryError {
    public static void main(String[] args) {
        outOfMemoryError();
    }

    public static void outOfMemoryError() {
        List<Object[]> arrays = new LinkedList<>();

        for (; ; ) {
            arrays.add(new Object[100]);
        }
    }
}
