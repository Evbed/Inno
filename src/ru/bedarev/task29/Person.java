package ru.bedarev.task29;

public class Person {
    private int age;
    private String lastName;
    private String sex;

    public Person(int age, String lastName, String sex) {
        this.age = age;
        this.lastName = lastName;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = age;
        result = 37 * result + (lastName == null ? 0 : lastName.hashCode());
        result = 37 * result + (sex == null ? 0 : sex.hashCode());
        return result;

    }

    @Override
    public String toString() {
        return "- Фамилия: [" + getLastName() + "] " +
                "Возраст: [" + getAge() + "] " +
                "Пол: [" + getSex() + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        if (!lastName.equals(other.lastName))
            return false;
        if (!sex.equals(other.sex))
            return false;
        return true;
    }
}
