import Utilities.Code;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * Name: Daniel Arias
 * Date: November 4th, 2023
 * Explanation: Defining Reader class
 */
public class Reader {
    public final static int CARD_NUMBER_ = 0;
    public final static int NAME_ = 1;
    public final static int PHONE_ = 2;
    public final static int BOOK_COUNT_ = 3;
    public final static int BOOK_START_ = 4;

    private int cardNumber;
    private String name;
    private String phone;
    private List<Book> books = new ArrayList<>();

    public Reader(int cardNumber, String name, String phone){
        this.cardNumber = cardNumber;
        this.name = name;
        this.phone = phone;
        List<Book> books = new ArrayList<>();
    }

    public Code addBook(Book book){
        if(this.books.contains(book)) return Code.BOOK_ALREADY_CHECKED_OUT_ERROR;
        this.books.add(book);
        return Code.SUCCESS;
    }
    public Code removeBook(Book book){
        if(!this.books.contains(book)) return Code.READER_DOESNT_HAVE_BOOK_ERROR;
        this.books.remove(book);
        return Code.SUCCESS;
    }
    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
    public int getBookCount(){
        return this.books.size();
    }
    public boolean hasBook(Book book){
        if(this.books.contains(book)) return true;
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reader)) return false;
        Reader reader = (Reader) o;
        return cardNumber == reader.cardNumber && Objects.equals(name, reader.name) && Objects.equals(phone, reader.phone) && Objects.equals(books, reader.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, name, phone, books);
    }

    @Override
    public String toString() {
        String printBooks = "";
        for(Book x: books){
            printBooks += x + ", ";
        }
        printBooks.substring(0, printBooks.length() - 2);
        printBooks += "}";

        return name + "(#" + cardNumber + ") has checked out {" + printBooks;
    }
}