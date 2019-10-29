package ru.bedarev.task07;


import java.util.Scanner;
import java.util.logging.*;

import static ru.bedarev.task07.Drink.*;


public class Main {

    static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VendingMachine automat1 = new VendingMachine("Пепси-кола", PEPSI, MIRINDA, SEVENUP);

        logger.info("Программа вызывает метод меню");
        System.out.println("Меню:");
        menu();
        control();


        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            logger.info("Пользователь вводит строковое значение команды");
            switch (input) {
                case "add":
                    logger.info("Пользователь вносит деньги");
                    System.out.println("Внесите купюры");
                    automat1.addCash(scanner.nextInt());
                    System.out.println("Ваш баланс: " + automat1.getBalance());
                    break;

                case "go":
                    logger.info("Пользователь вводит номер напитка");
                    int value = scanner.nextInt();
                    try {
                        automat1.getDrink(value);
                        System.out.println("Возьмите ваш напитоk");
                    } catch (NotEnoughMoneyException | WrongCommandException e) {
                        System.out.println("Недостаточно средств!");
                    }
                    System.out.println("Ваш баланс: " + automat1.getBalance());
                    break;

                case "exit":
                    logger.info("Пользователь выходит из программы");
                    System.out.println("Ваша cдача составляет: " + automat1.getBalance());
                    System.out.println("Спасибо за покупку!");
                    return;

                default:
                    logger.warning("Выбрана несуществующая команда!");
                    System.out.println("Несуществующая команда");
                    break;
            }
            scanner.nextLine();
        }
    }

    private static void control() {

        System.out.println("******************************");
        System.out.println("add  - Добавить купюры");
        System.out.println("go   - Перейти к выбору напитка");
        System.out.println("exit - Закончить покупку");
    }

    public static void menu() {
        for (int i = 0; i < VendingMachine.drinks.length; i++) {
            System.out.println(i + " - " + VendingMachine.drinks[i].getTitle() + " - " + VendingMachine.drinks[i].getCost() + " рублей");
        }
    }
}



