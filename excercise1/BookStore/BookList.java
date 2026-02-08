package excercise1.BookStore;

import java.util.*;

public class BookList {

    private ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book b) {
        bookList.add(b);
    }

    public void updateBook(String id) {
        for (Book b : bookList) {
            b.updateBook(id);
        }
    }

    public void deleteBook(String id) {
        bookList.removeIf(b -> b.getBookId().equals(id));
    }

    public Book findBookById(String id) {
        for (Book b : bookList) {
            if (b.getBookId().equals(id)) {
                return b;
            }
        }
        return null;
    }

    public void displayAll() {
        for (Book b : bookList) {
            b.displayBook();
        }
    }
}
