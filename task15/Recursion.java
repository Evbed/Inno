package task15;


import java.io.File;

public class Recursion {
    public static void main(String[] args) {
        show(new File("C:\\Users\\Lenovo\\IdeaProjects\\ru.bedarev\\src"), 0);
    }

    private static void show(File root, int level) {

        if (root != null && root.exists()) {
            if (root.isDirectory()) {
                level++;
                for (File file : root.listFiles()) {
                    show(file, level);
                }
            }
            if (root.isFile()) {
                System.out.println(root.getName());
                for (int i = 0; i < level; i++) {
                   System.out.print(".");
                }
            }
        }
    }
}


