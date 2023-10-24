package task2.pair;

public class Pair<T, E> {
    private T first;
    private E last;

    public Pair(T t, E e) {
        this.first = t;
        this.last = e;
    }


    public T first() {
        return first;
    }

    public E last() {
        return last;
    }

    public Pair<E, T> swap() {
        return new Pair<>(last, first);
    }

    public void replaceFirst(T newValue) {
        first = newValue;
    }

    public void replaceLast(E newValue) {
        last = newValue;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", last=" + last +
                '}';
    }
}
