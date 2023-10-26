package task3;

import java.util.Iterator;


public class GenericArray<E> implements Iterable<E> {
    private final E[] genericArray;

    public GenericArray(E[] genericArray) {
        this.genericArray = genericArray;
    }

    public void changeValue(int index, E newValue) {
        genericArray[index] = newValue;
    }

    public E getValue(int index) {
        return genericArray[index];
    }


    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

     class MyIterator implements Iterator<E>{
         private int count = 0;

         @Override
         public boolean hasNext() {
             return count < genericArray.length;
         }

         @Override
         public E next() {
             if (!hasNext()) {
                 return null;
             }
             return genericArray[count++];
         }
     }
}
