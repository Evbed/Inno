package src.ru.bedarev.task04;

import java.util.Scanner;

//Написать программу, которая описывает введенное число. Отрицательное оно число или положительное (или нулевое), чётное или нечётное.

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");

        int input = scanner.nextInt();

        if (input != 0) {
            if (input % 2 == 0) {
                System.out.print("Четное ");
            } else {
                System.out.print("Нечетное ");
            }
            if (input > 0) {
                System.out.println("положительное число");
            } else {
                System.out.println("отрицательное число");
            }
        } else {
            System.out.println("Число ноль");
        }

    }


//        String evenOrOdd = input % 2 == 0 ? "Четное" : "Нечетное";
//        String positiveOrNegative = input > 0 ? " положительное число" : " отрицательное число"; //if в if
//        if (input != 0) {
//            System.out.println(evenOrOdd + positiveOrNegative); //print
//        } else {
//            System.out.println("Нулевое число");
//        }

}

