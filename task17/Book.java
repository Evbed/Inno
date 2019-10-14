package task17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {


    Scanner scanner = new Scanner(System.in);
    private String title;
    private String author;
    private int yearOfPublishing;
    private int amountOfPages;

    List<Book> list = new ArrayList<>() ;

/*   public void listing (Book book){
       Book book1 = new Book(getTitle(), getAuthor(), getYearOfPublishing(), getAmountOfPages());
       list.add(book1);
   }*/

   /* Book(String title, String author, int yearOfPublishing, int amountOfPages){
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.amountOfPages = amountOfPages;
    }
*/
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    @Override
    public String toString() {
        return String.format("[title=%s, author=%s, yearOfPublishing=%d, amountOfPages]", title, author, yearOfPublishing, amountOfPages);
    }
}
