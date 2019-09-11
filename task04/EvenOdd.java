package task04;

import java.util.Scanner;

//Написать программу, которая описывает введенное число. Отрицательное оно число или положительное (или нулевое), чётное или нечётное.

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        String evenOrOdd = input % 2 == 0 ? "Четное" : "Нечетное";
        String positiveOrNegative = input > 0 ? " положительное число" : " отрицательное число";
        if (input != 0) {
            System.out.println(evenOrOdd + positiveOrNegative);
        } else {
            System.out.println("Нулевое число");
        }

    }
}
