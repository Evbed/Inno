package task06_01;

public class Liner implements Vehicle, Swimmable {
    @Override
    public void swim() {

    }

    @Override
    public void move() {
        System.out.println("Я лайнер, я везу много людей");

    }

    @Override
    public int waterBias() {
        return 150000;
    }
}
