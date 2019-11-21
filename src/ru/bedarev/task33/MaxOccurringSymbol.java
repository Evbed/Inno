package ru.bedarev.task33;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MaxOccurringSymbol {
    public static void main(String[] args) {
        String str = "This is test message";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            int k = 1;
            if (map.containsKey(c)) {
                k = map.get(c) + 1;
            }
            map.put(c, k);
        }

        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        Iterator<Map.Entry<Character, Integer>> iterator = set.iterator();
        Map.Entry<Character, Integer> max = null;

        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> me = iterator.next();
            if (max == null) {
                max = me;
            } else if (me.getValue() > max.getValue()) {
                max = me;
            }
        }

        System.out.println("Character: [" + max.getKey() + "] has occurred maximum times in String: " + max.getValue());
    }
}
