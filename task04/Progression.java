package task04;

import java.util.Scanner;

// Написать программу, которая выводит арифметическую или геометрическую прогрессию для N чисел.

public class Progression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 1;          // Стартовое число
        int d = 2;          // Знаменатель прогрессии

        for (int i = 1; i < n; ) {
            a = a + d;          //Для геометрической прогрессии используем а = a * d;
            i++;

            System.out.println(a);

        }
    }
}

