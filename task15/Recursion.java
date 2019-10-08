package task15;


import java.io.File;

public class Recursion {
    public static void main(String[] args) {
        show(new File("C:\\Users\\Lenovo\\IdeaProjects\\ru.bedarev\\src"));
    }

    private static void show(File root) {
        if (root != null && root.exists()) {
            if (root.isDirectory()) {
                for (File file : root.listFiles()) {
                    show(file);

                }
            }
            if (root.isFile()) {
                System.out.println(root.getName());
            }
        }
    }
}


