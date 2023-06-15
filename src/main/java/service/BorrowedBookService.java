package service;

import model.*;
import repository.LibraryBorrowedBookRepo;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class BorrowedBookService implements Subject{


    private LibraryBorrowedBookRepo libraryBorrowedBookRepo;
    private BookService bookService;
    private List<Observer> observerList;
    public BorrowedBookService() {
        this.libraryBorrowedBookRepo = new LibraryBorrowedBookRepo();
        this.bookService = new BookService();
    }

    public Optional<Book> borrowBook(User user, Long bookID) {
        Book book = null;

        Optional<Book> optionalBook = bookService.checkBook(bookID);

        LocalDate dueDate  = LocalDate.now().plusMonths(1);

        if (optionalBook.isPresent() && optionalBook.get().isAvailable()) {
            book = optionalBook.get();
            book.setAvailable(!book.isAvailable());

            BorrowedBook borrowedBook = new BorrowedBook(user,book, dueDate);
            libraryBorrowedBookRepo.addBorrowedBook(borrowedBook);
        }

       return Optional.ofNullable(book);
    }

    public boolean renewBorrowedBook(User user, Long idBorrowedBook) {
        Optional<BorrowedBook> foundBB = user.getBorrowedBookUserList()
                .stream()
                .filter(borrowedBook -> borrowedBook.getBook().getID() == idBorrowedBook)
                .findFirst();


        LocalDate nowDate = LocalDate.now();
        LocalDate dueDate  = LocalDate.now().plusWeeks(2);

        if (foundBB.isPresent()) {
            if (foundBB.get().getDueDate().isBefore(nowDate)) {
                foundBB.get().setDueDate(dueDate);
                return true;
            } else {
                this.notifyLibrarians("Please check due date and book");
                //librarian.notifyLibrarians(foundBB.get());
                return false;
            }
        }
        return false;
    }

    @Override
    public void attachLibrarian(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detachLibrarian(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyLibrarians(String notification) {
       observerList.forEach(observer -> observer.notify(notification));
    }

//    public BorrowedBook returnBorrowedBook(long idBorrowedBook) {
//
//    }
}
