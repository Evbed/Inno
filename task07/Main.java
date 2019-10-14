package task07;


import java.util.Scanner;
import java.util.logging.*;

import static task07.Drink.*;


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
                    automat1.addCash(scanner.nextInt());
                    System.out.println("Ваш баланс: " + automat1.getBalance());
                    break;

                case "go":
                    logger.info("Пользователь вводит номер напитка");
                    int value = scanner.nextInt();
                    automat1.getDrink(value);
                    System.out.println("Ваш баланс: " + automat1.getBalance());
                    break;

                case "exit":
                    logger.info("Пользователь выходит из программы");
                    System.out.println("Ваша здача составляет: " + automat1.getBalance());
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

