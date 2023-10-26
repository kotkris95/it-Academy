package task4;

import java.util.Iterator;

public class IteratorArray<E> implements Iterator<E> {
    private final E[][] matrix;
    private int i, j;

    public IteratorArray(E[][] matrix) {
        this.matrix = matrix;
    }

    @Override
    public boolean hasNext() {
        return i < matrix.length && j < matrix[i].length;
    }

    @Override
    public E next() {
        if (!hasNext()) {
            return null;
        }
        E value = matrix[i][j++];
        if (j >= matrix[i].length) {
            i++;
            j = 0;
        }
        return value;
    }
}
