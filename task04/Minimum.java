package task04;

import java.util.Scanner;
// Написать программу для поиска минимального из двух чисел.

public class Minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = a < b ? a : b;        //int min = Math.min(a, b);
        System.out.println(min);

    }

}


