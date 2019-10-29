package ru.bedarev.task19;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class ProductWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("products2.txt"))) {
            Formatter formatter = new Formatter(bw);

            System.out.println("+ Добавить покупку\n- Закончить формирование чека");

            while (scanner.hasNext()) {
                String chioce = scanner.nextLine();
                switch (chioce) {
                    case "+":
                        AddProduct(scanner, formatter);
                        break;
                    case "-":
                        return;
                }
                scanner.nextLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void AddProduct(Scanner scanner, Formatter formatter) {
        System.out.println("Введите наименование продукта:");
        String product = scanner.nextLine();
        System.out.println("Введите стоимость:");
        Float cost = scanner.nextFloat();
        System.out.println("Введите количество:");
        Float amount = scanner.nextFloat();
        formatter.format("%s\n%.2f\n%.2f\n", product, cost, amount);
        formatter.flush();
    }
}
