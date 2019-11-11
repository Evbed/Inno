package ru.bedarev.task29;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Map<String, Person> showMap = new HashMap<>(createMap());
        System.out.println("Мап до поиска дубликатов:");
        show(showMap);

        System.out.println("---------------------------------------------------" +
                "\nМап после обработки:");
        removeTheDuplicates(showMap);
        show(showMap);
    }

    private static Map<String, Person> createMap() {
        Map<String, Person> book = new HashMap<>();
        Person person1 = new Person(29, "Петрова", "Жен");
        Person person2 = new Person(34, "Сидорова", "Жен");
        Person person3 = new Person(34, "Тихонова", "Жен");
        Person person4 = new Person(35, "Петров", "Муж");
        book.put("Key1", person1);
        book.put("Key2", person1);
        book.put("Key3", person2);
        book.put("Key4", person3);
        book.put("Key5", person4);
        book.put("Key6", person4);
        return book;
    }

    private static void removeTheDuplicates(Map<String, Person> map) {
        Map<String, Person> copy = new HashMap<>(map);
        for (Map.Entry<String, Person> pair : copy.entrySet()) {
            int frequency = Collections.frequency(copy.values(), pair.getValue());
            if (frequency > 1) {
                removeItemFromMapByValue(map, pair.getValue());
            }
        }
    }

    private static void removeItemFromMapByValue(Map<String, Person> map, Person value) {
        Map<String, Person> copy = new HashMap<>(map);
        for (Map.Entry<String, Person> entry : copy.entrySet()) {
            if (entry.getValue().equals(value)) {
                map.remove(entry.getKey());
            }
        }
    }

    private static void show(Map<String, Person> map) {
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
