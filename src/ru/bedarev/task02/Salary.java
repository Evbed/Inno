package src.ru.bedarev.task02;

public class Salary {
    public static void main(String[] args) {
        int salary = Integer.parseInt(args[0]);     //ищем число в указанных аргументах прграммы
        int tax = salary * 13 / 100;

        System.out.println("Зарплата после вычета налога: " + (salary - tax) + " руб.");
    }
}
