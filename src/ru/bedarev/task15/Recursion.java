package ru.bedarev.task15;


import java.io.File;

public class Recursion {
    public static void main(String[] args) {
        show(new File("C:\\Users\\Lenovo\\IdeaProjects\\ru.bedarev\\src"), "");
    }

    private static void show(File root, String level) {


        if (root != null && root.exists()) {

            System.out.println(level + root.getName());

            if (root.isDirectory()) {

                for (File file : root.listFiles()) {
                    show(file, level + ".");
                }
            }
        }
    }
}



