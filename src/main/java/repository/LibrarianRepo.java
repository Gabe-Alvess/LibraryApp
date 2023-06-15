package repository;

import model.Librarian;
import model.User;

import java.util.List;

public interface LibrarianRepo {
    void addLibrarian(Librarian librarian);
    User getUser(String id);
    void update(Librarian librarian);
    List<Librarian> getAllLibrarian();
    void removeLibrarian(Librarian librarian);
}
