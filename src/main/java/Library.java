import Utilities.Code;

import java.util.HashMap;
import java.util.List;

public class Library {

  private static final int LENDING_LIMIT = 5;
  private String name;
  static int libraryCard;
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
}