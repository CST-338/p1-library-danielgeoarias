import Utilities.Code;

import java.util.HashMap;
import java.util.List;

public class Library {

  private static final int LENDING_LIMIT = 5;
  private String name;
  private static int libraryCard;
  private List<Reader> readers;
  private HashMap<String, Shelf> shelves;
  private HashMap<Book, Integer> books;

  public Code Library(String name) {

    //if(name.isEmpty()) return Code.FILE_NOT_FOUND_ERROR;
    String[] parts = name.split(",");

    System.out.println("Not implemented");

    return null;
  }

  public Code init(String filename) {
    System.out.println("Not implemented");
    return Code.NOT_IMPLEMENTED_ERROR;
  }

  public Code addBook(Book newBook){
    if(this.books.containsKey(newBook)){
      Integer count = this.books.get(newBook);
      count++;
      System.out.println(count + " copies of " + newBook.getTitle() + " in the stacks");
    }
    if (!this.books.containsKey(newBook)) {
      this.books.put(newBook, 1);
      System.out.println(newBook.getTitle() + " added to the stacks");
    }
    if(this.shelves.containsKey(newBook.getSubject())) {
      this.shelves.
      return Code.SUCCESS;
    }
    System.out.println("No shelf for " + newBook.getSubject() + " books");
    return Code.SHELF_EXISTS_ERROR;

  }
  public returnBook(Reader reader, Book book){
    if(!reader.hasBook(book)) {
      System.out.println(reader.getName() + " doesn't have " book.getTitle() + " checked out");
      return Code.READER_DOESNT_HAVE_BOOK_ERROR;;
    }
  }
  private Code addBookToShelf(Book book, Shelf shelf){

  }

}