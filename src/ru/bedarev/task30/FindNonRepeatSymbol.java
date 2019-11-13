package ru.bedarev.task30;

import java.util.HashMap;
import java.util.Map;

public class FindNonRepeatSymbol {
    public static void main(String[] args) {

        String total = "total";
        String teter = "teter";

        find(total);
        find(teter);
    }

    private static void find(String str) {
        Map<Character, Integer> countChars = new HashMap<>();
        char[] stringArray = str.toCharArray();

        for (char c : stringArray) {
            if (countChars.containsKey(c)) {
                countChars.put(c, countChars.get(c) + 1);
            } else {
                countChars.put(c, 1);
            }
        }

        for (char c : stringArray) {
            if (countChars.get(c) == 1) {
                System.out.println("Первый неповторяющийся символ в слове " + str + " = [" + c + "]");
                break;
            }
        }
    }
}
