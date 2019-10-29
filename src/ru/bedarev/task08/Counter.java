package ru.bedarev.task08;

public class Counter {

    static int count = 0;           //Счетчик создаваемых объектов

    public static void countOfObjects() {       //метод для получения информации о количестве
        System.out.println(count);
    }

    public static void main(String[] args) {

        for (int i = 0; i <10; i++) {
            Counter counter = new Counter();        //Создаём пять объектов
        }

        Counter.countOfObjects();       //Вызыаваем метод который выводит количество созданных объектов
    }

    Counter() {             //Конструктор, который при создании объекта Counter увеличивает счетчик на единицу
        count++;
    }

}
