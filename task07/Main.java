package task07;


import java.util.Scanner;
import java.util.logging.*;

import static task07.Drink.*;


public class Main {

    public static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VendingMachine automat1 = new VendingMachine("Пепси-кола", PEPSI, MIRINDA, SEVENUP);
        VendingMachine automat2 = new VendingMachine("Кока-кола", COCA_COLA, FANTA, SPRITE);


        logger.warning("Запустили программу");
        logger.info("Запустили программу");
        logger.severe("Запустили программу");
        System.out.println("Внесите сумму");
        int balance = scanner.nextInt();                            //Пополняем баланс
        System.out.println("Ваш баланс: " + balance + " рублей");


        automat1.menu();                                             //Вызов метода меню

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

