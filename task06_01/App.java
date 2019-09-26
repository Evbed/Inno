package task06_01;

public class App {
    public static void main(String[] args) {
        App app = new App();
        app.start();
    }

    private void start(){
        Car car1 = new Sedan();
        Car car2 = new Crossover();

        Driveable drive1 = new Sedan();
        Driveable drive2 = new Crossover();

        Vehicle vehicle1 = new Sedan();
        Vehicle vehicle2 = new Crossover();

        car1.drive();
        car1.move();
        car1.numberOfWheels();

        car2.drive();
        car2.move();
        car2.numberOfWheels();

        drive1.drive();
        drive1.move();

        drive2.drive();
        drive2.move();

        vehicle1.move();
        vehicle2.move();

        Crossover car3 = (Crossover) vehicle2;
        car3.numberOfWheels();
        car3.move();
        car3.drive();

    }
    void doNothing(Vehicle vehicle){
        vehicle.move();
    }

    void doSomething(CargoShip cs){
        cs.move();
    }
}
