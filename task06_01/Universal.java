package task06_01;

public class Universal extends Car {
    @Override
    public void drive() {
        super.drive();
    }

    @Override
    public void move() {
        System.out.println("Я универсал, еду по трассе и у меня большой багажник");
    }
}
