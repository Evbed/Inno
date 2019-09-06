package task02;

public class Salary {
    public static void main(String[] args) {
        int salary = 70000;
        int tax = salary / 100 * 13;

        System.out.println(salary - tax + " руб.");
    }
}
