package src.ru.bedarev.task06_01;

public class MilitaryPlane implements Vehicle, Flyable {

    int speedAverage = 1500;

    @Override
    public void fly() {

    }

    @Override
    public void move() {
        System.out.println("Я истребитель, могу быстро летать и вести огонь");

    }

    @Override
    public int distanceOfFligth() {
        return 1600;
    }
}
