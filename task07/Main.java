package task07;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VendingMachine automat = new VendingMachine();
        System.out.println("Внесите сумму");
        int balance = scanner.nextInt();                            //Пополняем баланс
        System.out.println("Ваш баланс: " + balance + " рублей");

        automat.menu();                                             //Вызов метода меню
        System.out.println("Выберете номер напитка:");
        int userChoice = scanner.nextInt();

        switch (userChoice) {
            case 0:
                if (balance < Drink.PEPSI.getCost() || balance == 0) {
                    System.out.println("Недостаточно средств");
                } else {
                    System.out.println("Возьмите ваш напиток");
                }
                break;
            case 1:
                if (balance < Drink.FANTA.getCost() || balance == 0) {
                    System.out.println("Недостаточно средств");
                } else {
                    System.out.println("Возьмите ваш напиток");
                }
                break;
            case 2:
                if (balance < Drink.SPRITE.getCost() || balance == 0) {
                    System.out.println("Недостаточно средств");
                } else {
                    System.out.println("Возьмите ваш напиток");
                }
                break;
            default:
                System.out.println("Несущетвующий номер напитка");


        }


    }


}

