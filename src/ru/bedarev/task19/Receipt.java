package ru.bedarev.task19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        float count = 0;
        System.out.printf("%12s %11s %8s %10s", "Наименование", "Цена", "Кол-во", "Стоимость" + "\n");
        System.out.println("===========================================");
        try (
                Scanner scanner = new Scanner(new File("products.txt"));
        ) {
            scanner.useLocale(Locale.US);
            scanner.useDelimiter("\n");

            while (scanner.hasNext()) {
                String prod = scanner.next();
                Float amount = scanner.nextFloat();
                Float price = scanner.nextFloat();
                Float sum = amount * price;

                count += sum;

                System.out.printf("%-18s%6.2f X  %5.3g =%8.2f \n", prod, price, amount, sum);
            }

            System.out.println("===========================================");
            System.out.printf("Итого: %36.2f", count);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

