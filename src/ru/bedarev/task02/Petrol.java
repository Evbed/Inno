package src.ru.bedarev.task02;

public class Petrol {
    public static void main(String[] args) {
        int costOfPetrol = Integer.parseInt(args[0]);   //ищем число в указанных аргументах прграммы
        int value = 50;

        System.out.println("Стоимость безнина: " + costOfPetrol * value + " руб.");
    }
}
