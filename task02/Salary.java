package task02;

public class Salary {
    public static void main(String[] args) {
        int salary = Integer.parseInt(args[0]);     //ищем число в указанных аргументах прграммы
        int tax = salary / 100 * 13;

        System.out.println(salary - tax + " руб.");
    }
}
