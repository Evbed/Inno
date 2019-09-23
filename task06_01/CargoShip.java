package task06_01;

public class CargoShip implements Vehicle, Swimmable {
    @Override
    public void swim() {

    }

    @Override
    public void move() {
        System.out.println("Я грузовой корабль, я везу большой груз");

    }

    @Override
    public int waterBias() {
        return 35000;
    }
}
