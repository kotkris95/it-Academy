package test.task1;

import java.io.Serializable;

public class Generic<T extends Comparable<T>, V extends Animal & Serializable, K extends Number> {
    T t;
    V v;
    K k;

    public Generic(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }
}
