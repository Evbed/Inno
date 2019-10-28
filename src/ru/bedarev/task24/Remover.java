package ru.bedarev.task24;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Remover {
    public static void main(String[] args) {
        Remover remover = new Remover();

        Set<String> set = new HashSet<>();
        set.add("foo");
        set.add("buzz");
        set.add("bar");
        set.add("fork");
        set.add("bort");
        set.add("spoon");
        set.add("!");
        set.add("dude");

        System.out.println("До обработки");
        for (String s : set) {
            System.out.print("[" + s + "]");
        }

        remover.removeEvenLength(set);

        System.out.println("\n" + "После обработки");
        for (String s : set) {
            System.out.print("[" + s + "]");
        }
    }

    public Set<String> removeEvenLength(Set<String> set) {
        for (Iterator<String> iterator = set.iterator(); iterator.hasNext(); ) {
            String str = iterator.next();
            if (str.length() % 2 == 0) {
                iterator.remove();
            }
        }
        return set;
    }
}

