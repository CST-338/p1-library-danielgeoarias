import java.time.LocalDate;
import java.util.Objects;

/**
 * Name: Daniel Arias
 * Date: November 4th, 2023
 * Explanation: Defining Book class
 */

public class Book {
    public final static int ISBN_ = 0;
    public final static int TITLE_ = 1;
    public final static int SUBJECT_ = 2;
    public final static int PAGE_COUNT_ = 3;
    public final static int AUTHOR_ = 4;
    public final static int DUE_DATE_ = 5;

    private String isbn;
    private String title;
    private String subject;
    private int pageCount;
    private String author;
    private LocalDate dueDate;

    public Book(String isbn, String title, String subject, int page, String author, LocalDate due_date) {
        this.isbn = isbn;
        this.title = title;
        this.subject = subject;
        this.pageCount = page;
        this.author = author;
        this.dueDate = due_date;
    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getPageCount() == book.getPageCount() && Objects.equals(isbn, book.isbn) && Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getSubject(), book.getSubject()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, subject, pageCount, author);
    }

    @Override
    public String toString() {
        return title + " by "+ author + " ISBN: " + isbn;
    }
}