package task1.person;

public class Person {
    private String name;
    private int age;
    private String gender;
    private double weight;

    public Person(String name, int age, String gender, double weight) {
        setName(name);
        setAge(age);
        setGender(gender);
        setWeight(weight);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        if (name.length() != 0) {
            this.name = name;
        } else System.out.println("Имя введено некорректно");
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else System.out.println("Возраст введен некорректно");
    }

    public void setGender(String gender) {
        if (gender.equals("female") || gender.equals("male")) {
            this.gender = gender;
        } else System.out.println("Пол введен некорректно");
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
