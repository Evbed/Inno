package src.ru.bedarev.task13;

import java.util.Scanner;

public class Mother {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Food.menu();

        String nameOfFood = scanner.nextLine();

        try {
            Child.eat(nameOfFood);
        } catch (Exception e) {
            System.out.println("Выплюнул еду");
        } finally {
            System.out.println("Спасибо, мама");
        }
    }


}

