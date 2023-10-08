package task1.person;

public class Student extends Person {
    private int year;

    public Student(String name, int age, String gender, double weight, int year) {
        super(name, age, gender, weight);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int addYear() {
        setYear(++year);
        return year;
    }

    public int addYear(int value) {
        setYear(year + value);
        return year;
    }
}
