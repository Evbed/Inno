package ru.bedarev.task06_01;

public class Truck implements Vehicle, Driveable {

    boolean hasTrailer = true;

    @Override
    public void drive() {

    }

    @Override
    public void move() {
        System.out.println("Я грузовик, везу груз");

    }


    public int numberOfWheels() {
        return 8;
    }


}
