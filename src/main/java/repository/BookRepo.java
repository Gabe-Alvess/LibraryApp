package repository;

import model.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepo {
    Optional<Book> getBook(long id);
    void addBook(Book book);
    Optional<Book> searchBook(String name);
    void updateBook(Book book);
    void removeBook(long id);
    List<Book> getAllBooks();
}
