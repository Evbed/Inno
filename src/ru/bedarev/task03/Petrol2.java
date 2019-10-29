package ru.bedarev.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Petrol2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));   //здесь используем BufferedReader
        System.out.println("Введите количество литров бензина для расчета стоимости");

        int costOfPetrol = 43;
        int value = Integer.parseInt(reader.readLine());

        System.out.println("Стоимость бензина составит: " + costOfPetrol * value + " руб.");
    }
}

