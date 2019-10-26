package src.ru.bedarev.task04;

import java.util.Scanner;

// Написать программу, которая выводит арифметическую или геометрическую прогрессию для N чисел.

public class Progression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество чисел для прогрессии:");
        int numberOfProgression = scanner.nextInt();

        int firstNum = 1;          // Стартовое число
        int secondNum = 2;          // Знаменатель прогрессии
        int viewFistNum = firstNum;
        System.out.println(viewFistNum);

        for (int i = 1; i < numberOfProgression; ) {// исправить про первое число
            firstNum = firstNum + secondNum;          //Для геометрической прогрессии используем а = a * d;
            i++;

            System.out.println(firstNum);

        }
    }
}

