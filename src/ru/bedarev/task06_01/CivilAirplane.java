package src.ru.bedarev.task06_01;

public class CivilAirplane implements Vehicle, Flyable {

    int speedAverage = 800;

    @Override
    public void fly() {

    }

    @Override
    public void move() {
        System.out.println("Я гражданский самолет, везу людей на отдых");

    }

    @Override
    public int distanceOfFligth() {
        return 21000;
    }
}
