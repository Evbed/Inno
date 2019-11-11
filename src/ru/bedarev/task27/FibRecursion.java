package ru.bedarev.task27;

import java.util.Scanner;

public class FibRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину ряда Фибоначчи");
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    private static int fib(int n) {
        if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}


