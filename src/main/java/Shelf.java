import Utilities.Code;

import java.util.HashMap;
import java.util.Objects;
/**
 * Name: Daniel Arias
 * Date: November 4th, 2023
 * Explanation: Defining Shelf class
 */
public class Shelf {
    public final static int SHELF_NUMBER_ = 0;
    public final static int SUBJECT_ = 1;
    private HashMap<Book, Integer> books;
    private int shelfNumber;
    private String subject;

    public Shelf(){
    }
    public Shelf(int shelfNum, String newSubject){
        this.shelfNumber = shelfNum;
        this.subject = newSubject;
    }

    public Code addBook(Book book){
        boolean match = books.containsKey(book);
//        if(match){
//            int currentValue = books.get(book);
//            books.put(book, currentValue + 1);
//            System.out.println(book.toString() + " added to shelf " + this.toString());
//            return Code.SUCCESS;
//        }
        if(!match && book.getSubject().equals(this.subject)){
            books.put(book, 1);
            System.out.println(book.toString() + " added to shelf " + this.toString());
            return Code.SUCCESS;
        }
        if(!match && !book.getSubject().equals(this.subject)){
            return Code.SHELF_SUBJECT_MISMATCH_ERROR;
        }
        int currentValue = books.get(book);
            books.put(book, currentValue + 1);
            System.out.println(book.toString() + " added to shelf " + this.toString());
            return Code.SUCCESS;
    }
    public Code removeBook(Book book){
        boolean match = books.containsKey(book);
        int count = books.get(book);
        if(!match) {
            System.out.println(book.getTitle() + " is not on the shelf " + this.subject);
            return Code.BOOK_NOT_IN_INVENTORY_ERROR;
        }
        if(match && count == 0){
            System.out.println("No copies of " + book.getTitle() + "on shelf " + this.subject);
            return Code.BOOK_NOT_IN_INVENTORY_ERROR;
        }
        if(count >= 1){
            int currentValue = books.get(book);
            books.put(book, currentValue - 1);
            System.out.println(book.getTitle() + " successfully removed from shelf " + this.subject);
            return Code.SUCCESS;
        }
        return  Code.SUCCESS;
    }
    public String listBooks(){
        String allBooks = books.size() + " books on shelf: ";
        allBooks += this.toString();
        for(Book x: this.books.keySet()){
            allBooks += x.toString();
        }
        return allBooks;
    }
    public int getBookCount(Book book){
        int count = books.get(book);
        if(count == 0) return -1;
        return count;
    }

    public HashMap<Book, Integer> getBooks() {
        return books;
    }

    public void setBooks(HashMap<Book, Integer> books) {
        this.books = books;
    }


    public int getShelfNumber() {
        return shelfNumber;
    }

    public void setShelfNumber(int shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shelf)) return false;
        Shelf shelf = (Shelf) o;
        return getBooks() == shelf.getBooks() && getShelfNumber() == shelf.getShelfNumber() && getSubject() == shelf.getSubject();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBooks(), getShelfNumber(), getSubject());
    }

    @Override
    public String toString() {
        return shelfNumber + " : " + subject;
    }
}