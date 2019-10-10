package task07;


import java.util.Scanner;
import java.util.logging.*;

import static task07.Drink.*;
import static task07.VendingMachine.balance;
import static task07.VendingMachine.getBalance;


public class Main {

    static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VendingMachine automat1 = new VendingMachine("Пепси-кола", PEPSI, MIRINDA, SEVENUP);

        logger.info("Программа вызывает метод меню");
        automat1.menu();

        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            logger.info("Пользователь вводит строковое значение команды");
            switch (input) {
                case "add":
                    logger.info("Пользователь вносит деньги");
                    VendingMachine.getBalance(scanner.nextInt());
                    System.out.println("Ваш баланс: " + balance);
                    break;

                case "go":
                    logger.info("Пользователь вводит номер напитка");
                    int value = scanner.nextInt();
                    VendingMachine.getDrink(value);
                    System.out.println("Ваш баланс: " + balance);
                    break;

                case "exit":
                    logger.info("Пользователь выходит из программы");
                    System.out.println("Ваша здача составляет: " + balance);
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
}

