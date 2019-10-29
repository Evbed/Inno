package ru.bedarev.task06_01;

public abstract class Car implements Vehicle, Driveable {

    private boolean fourWheelDrive;
    private int numberOfWheels;

    @Override
    public void drive() {
        System.out.println("Я автомобиль, я еду, полноприводный - " + fourWheelDrive);
    }

    @Override
    public void move() {
        System.out.println("Я автомобиль, полноприводный - " + fourWheelDrive);

    }


    public int numberOfWheels() {
        return numberOfWheels;
    }


}
