package src.ru.bedarev.task17;


import java.io.Serializable;

public class Book implements Serializable {
    final static long serialVersionUID = 1l;

    private String title;
    private String author;
    private int yearOfPublishing;
    private int amountOfPages;

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
        return String.format("[Название = %s, Автор = %s, Год издания = %d, Количество страниц = %d]", title, author, yearOfPublishing, amountOfPages);
    }
}
