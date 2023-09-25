package task2;

public class Student {
    int id;
    String surname;
    String name;
    String patronymic;
    int yearOfBirth;
    String address;
    long phoneNumber;
    String faculty;
    int course;
    int group;
    Student student;
    Student[] students;

    public Student(int id, String name, String surname, String patronymic, int yearOfBirth,
                   String faculty, int course, int group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(int id, String name, String surname, String patronymic, int yearOfBirth,
                   String address, long phoneNumber, String faculty, int course, int group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(String name, String surname, String patronymic, String faculty, int course) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.faculty = faculty;
        this.course = course;
    }

    public Student(String name, String surname, String patronymic, int group) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.group = group;
    }

    public static void getFaculty(Student[] students, String value) {
        System.out.println("Студенты " + value + " факультета: ");
        for (int i = 0; i < students.length; i++) {
            if (students[i].faculty.equals(value)) {
                System.out.println(students[i].toString());
            }
        }
    }

    public static void getFacultyAndCourse(Student[] students, String value, int c) {
        System.out.println("Студенты " + value + " факультета " + c + " курса: ");
        for (int i = 0; i < students.length; i++) {
            if (students[i].faculty.equals(value) && students[i].course == c) {
                System.out.println(students[i].toString());
            }
        }
    }

    public static void bornAfter(Student[] students, int y) {
        System.out.println("СтудентыБ родившиеся после  " + y + " года: ");
        for (int i = 0; i < students.length; i++) {
            if (students[i].yearOfBirth > y) {
                System.out.println(students[i].toString());
            }
        }
    }

    public static void getCourse(Student[] students, int c) {
        System.out.println("Список студентов " + c + " группы: ");
        for (int i = 0; i < students.length; i++) {
            if (students[i].group == c) {
                System.out.println(students[i].toString());
            }
        }
    }

    @Override
    public String toString() {
        return "task2.Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group=" + group +
                '}';
    }
}

