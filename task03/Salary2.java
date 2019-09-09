package task03;

import java.util.Scanner;

public class Salary2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       //вводим значение через Scanner
        int salary = sc.nextInt();
        int tax = salary / 100 * 13;

        System.out.println(salary - tax + " руб.");
    }
}
