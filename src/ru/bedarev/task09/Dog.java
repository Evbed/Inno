package src.ru.bedarev.task09;

public class Dog extends Animal implements Run, Swim {
    @Override
    public void getName() {
        System.out.println("Собака");
    }

    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }
}
