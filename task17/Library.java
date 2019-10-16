package task17;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    static String filename = "Books.bin";


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> list = new ArrayList<>();

        Book book1 = new Book();
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
        list.add(book3);


        menu();
        saveBooks(book1, book2, book3);
        loadBooks();




    }

 /*   private static void control(Scanner scanner) {
        while (scanner.hasNext()) {
            int key = scanner.nextInt();
            switch (key) {

                case 1:
                    addBook();
                    saveBooks();

                    break;
                case 2:
                    loadBooks();

                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }
    }*/

    public static void saveBooks(Book... books) {
        System.out.println("Сохраняем книги...");
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


  /*  public static Object addBook() {
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
        list.add(new Book());

        return Library.list.add(book);


    }
*/
    public static Book[] loadBooks() {
            Book[] books = null;
            try (
                    FileInputStream fis = new FileInputStream(filename);
                    ObjectInputStream ois = new ObjectInputStream(fis)
            ) {
                books = (Book[]) ois.readObject();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Загружаем книги");
            for (Book book : books) {
                System.out.println(book.toString());
            }
            return books;
        }

    private static void menu() {
        System.out.println("Выберите пункт меню: \n********************");
        System.out.println("1 - Добавить книгу");
        System.out.println("2 -    Список книг");
        System.out.println("3 -  Удалить книгу");
        System.out.println("4 -    Найти книгу \n********************");
    }


}


