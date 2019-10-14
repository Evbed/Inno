package task17;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Book> list = new ArrayList<>();
        menu();



        while (scanner.hasNext()){
            int key = scanner.nextInt();
            switch (key){

                case 1:
                    addBook();

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;



            }
        }



    }
    public static <list> ArrayList addBook(){
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
        scanner.close();
        return null;



    }

    private static void menu() {
        System.out.println("Выберите пункт меню: \n********************" );
        System.out.println("1 - Добавить книгу");
        System.out.println("2 -    Список книг");
        System.out.println("3 -  Удалить книгу");
        System.out.println("4 -    Найти книгу \n********************");
    }


}
