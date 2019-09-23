package task03;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

import static java.math.BigDecimal.ROUND_CEILING;

public class TimeConvert2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество секунд для конвертации в часы");

        double seconds = scanner.nextDouble();
        double covert = seconds / 60 / 60;

        String formattedDouble = new DecimalFormat("0.00").format(covert);

        System.out.println(formattedDouble);
    }
}
