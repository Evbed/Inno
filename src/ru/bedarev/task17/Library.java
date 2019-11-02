package ru.bedarev.task17;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private static String filename = "Books.bin";
    private static ArrayList<Book> list = new ArrayList<>();

    public static void main(String[] args) throws NotFoundCommandException {
        Scanner scanner = new Scanner(System.in);
        list = loadBooks();
        menu();
        control(scanner);
    }

    private static void control(Scanner scanner) throws NotFoundCommandException {
        while (scanner.hasNext()) {
            int key = scanner.nextInt();
            switch (key) {
                case 1:
                    addBook();
                    break;

                case 2:
                    System.out.println("Загружаем книги...");
                    for (Book book : list) {
                        System.out.println(book);
                    }

                case 3:
                    System.out.println("Сохраняем книги...");
                    saveBooks(list);
                    break;

                default:
                    throw new NotFoundCommandException("Несуществующая команда!");
            }
        }
    }

    private static void saveBooks(ArrayList<Book> books) {
        for (Book book : books) {
            System.out.println(book.toString());
        }
        try (
                FileOutputStream fos = new FileOutputStream(filename);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            oos.writeObject(books);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<Book> addBook() {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();

        System.out.println("Введите название книги:");
        book.setTitle(scanner.nextLine());
        System.out.println("Введите Автора книги:");
        book.setAuthor(scanner.nextLine());
        System.out.println("Введите год издательства:");
        book.setYearOfPublishing(scanner.nextInt());
        System.out.println("Введите количество страниц:");
        book.setAmountOfPages(scanner.nextInt());
        list.add(book);

        return list;
    }

    private static void menu() {
        System.out.println("Выберите пункт меню: \n********************");
        System.out.println("1 -    Добавить книгу");
        System.out.println("2 -       Список книг");
        System.out.println("3 - Сохранить и выйти\n********************");
    }
    //

       /* Book book1 = new Book();
        book1.setTitle("Пресутпление и наказание");
        book1.setAuthor("Ф.М. Достоевский");
        book1.setYearOfPublishing(1886);
        book1.setAmountOfPages(574);
        list.add(book1);

        Book book2 = new Book();
        book2.setTitle("Война и мир");
        book2.setAuthor("Л.Н. Толстой");
        book2.setYearOfPublishing(1873);
        book2.setAmountOfPages(1225);
        list.add(book2);

        Book book3 = new Book();
        book3.setTitle("Горе от ума");
        book3.setAuthor("А.С. Грибоедов");
        book3.setYearOfPublishing(1831);
        book3.setAmountOfPages(98);
        list.add(book3);*/      //для добавления книг без пользования scanner

      private static ArrayList<Book> loadBooks() {
        if (!Files.exists(new File(filename).toPath())) {
            return new ArrayList<>();
        }
        ArrayList<Book> books = null;
        try (
                FileInputStream fis = new FileInputStream(filename);
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            books = (ArrayList<Book>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Загружаем книги");
        if (books == null) {
            return new ArrayList<>();
        } else {
            for (Book book : books) {
                System.out.println(book.toString());
            }
            return books;
        }
    }
}


