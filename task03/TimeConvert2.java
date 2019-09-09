package task03;

import java.util.Scanner;

public class TimeConvert2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();
        int convert = seconds / 60 / 60;

        System.out.println(convert);
    }
}
