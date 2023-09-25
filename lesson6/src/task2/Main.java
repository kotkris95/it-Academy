package task2;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student(111, "Котлярова", "Кристина", "Сергеевна", 1995,
                "Студенческий проезд, 15", 375257312780L, "Физ-мат", 5, 555);
        Student st2 = new Student(112, "Березняцкая", "Марина", "Владимировна", 1996,
                "Кирова, 6", 375292568456L, "Физ-мат", 4, 444);
        Student st3 = new Student(113, "Ключенович", "Анастасия", "Игоревна", 1997,
                "ул. Одесская, 1", 375291564789L, "Физ", 3, 333);
        Student st4 = new Student(114, "Пилипончик", "Наталья", "Сергеевна", 1998,
                "Богданова, 15", 375295647896L, "Мат", 2, 222);
        Student st5 = new Student(115, "Нестерович", "Анна", "Игоревна", 1999,
                "60 лет БССР, 20", 375296547896L, "Физ-мат", 1, 111);
        Student st6 = new Student(116, "Асташкевич", "Любовь", "Владимировна", 1995,
                "Кирова,1", 375257312780L, "Физ-мат", 5, 555);
        Student st7 = new Student(117, "Сухов", "Антон", "Николаевич", 1997,
                "Ленина,60", 375298756422L, "Физ", 3, 333);
        Student st8 = new Student(118, "Рабцевич", "Евгений", "Николаевич", 1998,
                "Международная, 92", 375296547852L, "Мат", 2, 222);
        Student st9 = new Student(119, "Кондратеня", "Евгений", "Игоревич", 1996,
                "Лесная, 90", 375257312780L, "Физ-мат", 4, 444);
        Student st10 = new Student(120, "Ширченко", "Анатолий", "Игоревич", 1999,
                "ул. Белого, 55", 37529564782L, "Физ-мат", 1, 111);
        Student st11 = new Student(121, "Шепелевич", "Сергей", "Сергеевич", 1995,
                "Лесная,1", 37529655488L, "Физ-мат", 5, 555);
        Student st12 = new Student(122, "Супрун", "Евгений", "Игоревич", 1996,
                "Речецкий проезд, 15", 375257312780L, "Физ-мат", 4, 444);
        Student st13 = new Student(123, "Лойко", "Анна", "Игоревна", 1997,
                "Студенческий проезд, 1", 375257312780L, "Физ", 3, 333);
        Student st14 = new Student(124, "Варейко", "Елена", "Александровна", 1998,
                "Пушкина, 65", 37525654789L, "Мат", 2, 222);
        Student st15 = new Student(125, "Хомец", "Александра", "Сергеевна", 1999,
                "Речицкий проспект, 65", 375296547896L, "Физ-мат", 1, 111);

        Student[] students = new Student[15];
        students[0] = st1;
        students[1] = st2;
        students[2] = st3;
        students[3] = st4;
        students[4] = st5;
        students[5] = st6;
        students[6] = st7;
        students[7] = st8;
        students[8] = st9;
        students[9] = st10;
        students[10] = st11;
        students[11] = st12;
        students[12] = st13;
        students[13] = st14;
        students[14] = st15;

        Student.getFaculty(students, "Физ-мат");
        Student.getFaculty(students, "Физ");
        Student.getFaculty(students, "Мат");

        Student.getFacultyAndCourse(students, "Физ-мат", 1);
        Student.getFacultyAndCourse(students, "Физ", 3);
        Student.bornAfter(students, 1996);
        Student.getCourse(students, 111);
    }
}
