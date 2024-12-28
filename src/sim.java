public class sim {
    private String name;      // Имя
    private String surname;   // Фамилия
    private int age;          // Возраст
    private boolean gender;   // Пол (true — мужчина, false — женщина)
    private double gpa;       // Средний балл

    // Геттеры и сеттеры для каждого поля
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Метод toString для красивого вывода
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender=" + (gender ? "Male" : "Female") +
                ", gpa=" + gpa +
                '}';
    }
}
