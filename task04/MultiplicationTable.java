package task04;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arg = sc.nextInt(); // Вводим множитель

        for (int i = 1; i <= 10; i++) {
            System.out.print(arg * i + " ");

        }
    }
}
