package service;

import model.Book;
import repository.LibraryBookRepo;

import java.util.Optional;

public class BookService {
    private LibraryBookRepo bookRepo;

// Todo
//  Check in main for the optional.isPresent
    public Optional<Book> checkBook(Long bookId) {
       return bookRepo.getBook(bookId);
    }
}
