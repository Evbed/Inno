package src.ru.bedarev.task06_01;

public class Crossover extends Car {

    private boolean fourWheelDrive = true;

    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public void move() {
        System.out.println("Я кроссовер, могу ехать по бездорожью");
    }

}
