package src.ru.bedarev.task07;

public class WrongCommandException extends Exception {

    public WrongCommandException() {
        System.out.println("Несуществущая команда!");
    }
}
