package task4;

import java.util.*;


public class SortedList<E extends Comparable<E>> implements List<E> {

    List<E> sortedList;
    Comparator<E> comparator;

    public SortedList() {
        sortedList = new ArrayList<>();
    }

    public SortedList(Comparator comparator) {
        sortedList = new ArrayList<>(10);
        this.comparator = comparator;
    }


    @Override
    public int size() {
        return sortedList.size();
    }

    @Override
    public boolean isEmpty() {
        return sortedList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return sortedList.contains(o);
    }

    @Override
    public Iterator iterator() {
        return sortedList.iterator();
    }

    @Override
    public Object[] toArray() {
        return sortedList.toArray();
    }

    @Override
    public <E> E[] toArray(E[] a) {
        return sortedList.toArray(a);
    }


    @Override
    public boolean add(E e) {
        int index = 0;
        while (index < sortedList.size() && e.compareTo(sortedList.get(index)) > 0) {
            index++;
        }
        sortedList.add(index, e);
        return true;

    }

    @Override
    public boolean remove(Object element) {
        return sortedList.remove(element);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        sortedList.addAll(c);
        sortedList.sort(comparator);
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        sortedList.addAll(index, c);
        sortedList.sort(comparator);
        return true;
    }


    @Override
    public void clear() {
        sortedList.clear();
    }


    @Override
    public E get(int index) {
        return sortedList.get(index);
    }

    @Override
    public E set(int index, E element) {
        E removed = sortedList.get(index);
        sortedList.add(index, element);
        return removed;
    }

    @Override
    public void add(int index, E element) {
        sortedList.add(index, element);
    }

    @Override
    public E remove(int index) {
        E removed = sortedList.get(index);
        sortedList.remove(index);
        return removed;
    }

    @Override
    public int indexOf(Object o) {
        return sortedList.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return sortedList.lastIndexOf(o);
    }

    @Override
    public ListIterator listIterator() {
        return sortedList.listIterator();
    }

    @Override
    public ListIterator listIterator(int index) {
        return sortedList.listIterator(index);
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return sortedList.subList(fromIndex, toIndex);
    }

    @Override
    public Spliterator spliterator() {
        return sortedList.spliterator();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return sortedList.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return sortedList.removeAll(c);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return new HashSet<>(sortedList).containsAll(c);
    }

    @Override
    public String toString() {
        return "List=" + sortedList;
    }
}
