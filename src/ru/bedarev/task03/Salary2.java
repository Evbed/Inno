package src.ru.bedarev.task03;

import java.math.BigDecimal;
import java.util.Scanner;

import static java.math.BigDecimal.ROUND_CEILING;

public class Salary2 {
    public static void main(String[] args) {
        System.out.println("Введите сумму зарплаты, что бы вычесть налог");
        Scanner scanner = new Scanner(System.in);
        BigDecimal salary = new BigDecimal(scanner.nextLine());     //вводим сумму
        BigDecimal sum = new BigDecimal("100");                 //сто процентов
        BigDecimal taxRate = new BigDecimal("13");              //налоговая ставка

        taxRate = salary.subtract((salary.multiply(taxRate)).divide(sum));      //  salary * 13 / 100

        System.out.println("Сумма после вычета налога: " + taxRate.setScale(2, ROUND_CEILING) + " рублей");





        //  int tax = salary * 13 / 100;



       // System.out.println("Сумма после вычета налога: " + (salary - tax) + " руб.");
    }
}
