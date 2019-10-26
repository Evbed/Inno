package src.ru.bedarev.task09;

public class Cat extends Animal implements Run{
    @Override
    public void getName() {
        System.out.println("Кошка");
    }

    @Override
    public void run() {

    }
}
