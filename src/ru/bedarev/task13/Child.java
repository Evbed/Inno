package src.ru.bedarev.task13;

public class Child {
    public static void eat(String food) throws Exception {
        if (food.equals(Food.COOKIE.getTitle()) || food.equals(Food.CANDY.getTitle())) {
            System.out.println("Съел за обе щеки");
        } else {
            throw new Exception();
        }

    }
}
