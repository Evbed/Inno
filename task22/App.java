package task22;

import java.util.*;

public class App {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Tom", 10));
        people.add(new Person("Nick", 20));
        people.add(new Person("Tom", 30));
        people.add(new Person("Bill", 45));
        people.add(new Person("Bill", 47));
        people.add(new Person("Bill", 46));

        Collections.sort(people, new PersonSuperComparator());
        System.out.println("Сортировка по имени:");
        for (Person person : people) {
            System.out.println(person.getName() + " " + person.getAge());
        }

        Collections.sort(people, new PersonAgeComparator());
        System.out.println("Сортировка по возрасту:");
        for (Person person : people) {
            System.out.println(person.getName() + " " + person.getAge());
        }

        Collections.sort(people, new PersonSuperComparator().thenComparing(new PersonAgeComparator()));
        System.out.println("Сортировка по имени а затем по возрасту");
        for (Person person : people) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
