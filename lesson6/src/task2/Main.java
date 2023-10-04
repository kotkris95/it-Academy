package task2;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student(111, "Котлярова", "Кристина", "Сергеевна", 1995,
                        "Студенческий проезд, 15", 375257312780L, "Физ-мат", 5, 555),
                new Student(112, "Березняцкая", "Марина", "Владимировна", 1996,
                        "Кирова, 6", 375292568456L, "Физ-мат", 4, 444),
                new Student(113, "Ключенович", "Анастасия", "Игоревна", 1997,
                        "ул. Одесская, 1", 375291564789L, "Физ", 3, 333),
                new Student(115, "Нестерович", "Анна", "Игоревна", 1999,
                        "60 лет БССР, 20", 375296547896L, "Физ-мат", 1, 111),
                new Student(117, "Сухов", "Антон", "Николаевич", 1997,
                        "Ленина,60", 375298756422L, "Физ", 3, 333),
                new Student(119, "Кондратеня", "Евгений", "Игоревич", 1996,
                        "Лесная, 90", 375257312780L, "Физ-мат", 4, 444),
                new Student(121, "Шепелевич", "Сергей", "Сергеевич", 1995,
                        "Лесная,1", 37529655488L, "Физ-мат", 5, 555),
                new Student(122, "Супрун", "Евгений", "Игоревич", 1996,
                        "Речецкий проезд, 15", 375257312780L, "Физ-мат", 4, 444),
                new Student(124, "Варейко", "Елена", "Александровна", 1998,
                        "Пушкина, 65", 37525654789L, "Мат", 2, 222)
        };

        getFaculty(students, "Физ");
        getFacultyAndCourse(students, "Физ-мат", 1);
        bornAfter(students, 1997);
        getCourse(students, 444);
    }

    public static void getFaculty(Student[] students, String value) {
        System.out.println("Студенты " + value + " факультета: ");
        for (Student student : students) {
            if (student.faculty.equals(value)) {
                System.out.println(student);
            }
        }
    }

    public static void getFacultyAndCourse(Student[] students, String value, int c) {
        System.out.println("Студенты " + value + " факультета " + c + " курса: ");
        for (Student student : students) {
            if (student.faculty.equals(value) && student.course == c) {
                System.out.println(student);
            }
        }
    }

    public static void bornAfter(Student[] students, int y) {
        System.out.println("Студенты, родившиеся после  " + y + " года: ");
        for (Student student : students) {
            if (student.yearOfBirth > y) {
                System.out.println(student);
            }
        }
    }

    public static void getCourse(Student[] students, int c) {
        System.out.println("Список студентов " + c + " группы: ");
        for (Student student : students) {
            if (student.group == c) {
                System.out.println(student);
            }
        }
    }
}
