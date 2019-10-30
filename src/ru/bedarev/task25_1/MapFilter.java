package ru.bedarev.task25_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFilter {
    public static void main(String[] args) {
        MapFilter mapFilter = new MapFilter();
        Map<String, String> map = new HashMap<>();
        map.put("Вася", "Иванов");
        map.put("Петр", "Петров");
        map.put("Виктор", "Сидоров");
        map.put("Сергей", "Савельев");
        map.put("Вадим", "Викторов");

        System.out.println(mapFilter.isUnique(map));
        map.clear();

        map.put("Вася", "Иванов");
        map.put("Петр", "Петров");
        map.put("Виктор", "Иванов");
        map.put("Сергей", "Савельев");
        map.put("Вадим", "Иванов");

        System.out.println(mapFilter.isUnique(map));
    }

    private boolean isUnique(Map<String, String> map) {
        boolean b = false;
        Set valueSet = new HashSet(map.values());

        if (map.values().size()==valueSet.size() || map.isEmpty()){
            b = true;
        }
        return b;
    }
}