package task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Petrol2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));   //здесь используем BufferedReader

        int costOfPetrol = 43;
        int value = Integer.parseInt(reader.readLine());

        System.out.println(costOfPetrol * value + " руб.");
    }
}

