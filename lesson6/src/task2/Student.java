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

    @Override
    public String toString() {
        return "Студент{" +
                "id=" + id +
                ", фамилия: '" + name + '\'' +
                ", имя: '" + surname + '\'' +
                ", отчество: '" + patronymic + '\'' +
                ", год рождения: " + yearOfBirth +
                ", адрес: '" + address + '\'' +
                ", номер телефона: " + phoneNumber +
                ", факультет: '" + faculty + '\'' +
                ", курс: " + course +
                ", группа: " + group +
                '}';
    }
}

