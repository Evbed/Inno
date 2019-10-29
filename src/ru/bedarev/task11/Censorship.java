package ru.bedarev.task11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Censorship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        Pattern pattern = Pattern.compile("(?iu)\\bбяка\\b");

        Matcher matcher = pattern.matcher(userInput);

        System.out.println(matcher.replaceAll(" *Вырезано цензурой* "));


    }
    }



