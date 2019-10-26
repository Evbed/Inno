package src.ru.bedarev.task04;

import java.util.Scanner;
// Написать программу для поиска минимального из двух чисел.

public class Minimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа для поиска минимального из двух чисел");
        System.out.println("Введите первое число");

        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();
        int minimum = firstNumber < secondNumber ? firstNumber : secondNumber;        //int min = Math.min(a, b);
        System.out.println("Минимальное число: " + minimum);

    }

}


