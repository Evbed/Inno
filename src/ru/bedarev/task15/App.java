package ru.bedarev.task15;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;



public class App {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Lenovo\\IdeaProjects\\ru.bedarev\\src\\ru.bedarev.task15\\dir1\\1.txt");  //создаем файл

        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        file.renameTo(new File("C:\\Users\\Lenovo\\IdeaProjects\\ru.bedarev\\src\\ru.bedarev.task15\\dir1\\2.txt")); //переименуем

        Path source = Paths.get("C:\\Users\\Lenovo\\IdeaProjects\\ru.bedarev\\src\\ru.bedarev.task15\\dir1\\2.txt");       //копируем
        Path newDir = Paths.get("C:\\Users\\Lenovo\\IdeaProjects\\ru.bedarev\\src\\ru.bedarev.task15\\dir1\\2.2.txt");
        Files.copy(source, newDir);

        Files.delete(newDir);       //удаляем


    }


}

