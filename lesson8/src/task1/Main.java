package task1;

import task1.person.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Кристина", 27, "женский", 50, 1);
        System.out.println(student.addYear());
        System.out.println(student.addYear(3));
    }
}
