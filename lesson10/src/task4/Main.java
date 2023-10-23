package task4;


import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        SortedList<Integer> sortedList = new SortedList<>();
        sortedList.add(3);
        sortedList.add(1);
        sortedList.add(4);
        sortedList.add(2);
        System.out.println("Отсортированный лист: " + sortedList);
        System.out.println("Длина листа: " + sortedList.size());
        System.out.println("Лист пустой? " + sortedList.isEmpty());
        System.out.println("Лист содержит переменную \"1\"? " + sortedList.contains(1));
        System.out.println("Лист содержит переменную \"10\"? " + sortedList.contains(10));

        System.out.println("Итератор: ");
        Iterator iterator = sortedList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\nУдаленный элемент c индексом 3: " + sortedList.remove(3));
        System.out.println("Лист, после удаления элемента: " + sortedList);

        SortedList<Integer> listForAdd = new SortedList<>();
        listForAdd.add(2);
        listForAdd.add(5);
        listForAdd.add(10);
        listForAdd.add(8);
        System.out.println("Лист, созданный для добавления элементов к sortedList " + listForAdd);
        sortedList.addAll(listForAdd);
        System.out.println("sortedList: " + sortedList);
        System.out.println("Индекс элемента 2: " + sortedList.indexOf(2));
        System.out.println("Последний индекс элемента 2: " + sortedList.lastIndexOf(2));
        sortedList.removeAll(listForAdd);
        System.out.println("Лист, после удаления listForAdd: " + sortedList);
        System.out.println("Содержат ли в листе sortedList элементы листа listForAdd? "
                + sortedList.containsAll(listForAdd));

    }

}
