package task06_01;

public class Car implements Vehicle, Driveable {

    boolean fourWheelDrive = false;

    @Override
    public void drive() {

    }

    @Override
    public void move() {
        System.out.println("Я автомобиль, еду по трассе");

    }

    @Override
    public int numberOfWheels() {
        return 4;
    }


}
