package ru.bedarev.task27;

import java.util.Scanner;

public class FibIteration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину рядя Фибоначчи");
        int num = scanner.nextInt();

        int num0 = 0;
        int num1 = 1;
        int num2;

        System.out.print(num0 + " " + num1 + " ");
        for (int i = 3; i < num ; i++) {
            num2 = num0 + num1;
            System.out.print(num2 + " ");
            num0 = num1;
            num1 = num2;
        }
    }
}