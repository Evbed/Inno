package task09;

public class Runner extends Human{

    @Override
    public void runFast() {
        System.out.println("Бегу быстро");
    }

    @Override
    public void runSlow() {
        System.out.println("Бегу медленно, но далеко");;
    }
}
