package repository;

import model.Librarian;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class LibraryLibrarianRepo implements LibrarianRepo {
    private List<Librarian> librarians = new ArrayList<>();
    @Override
    public void addLibrarian(Librarian librarian) {
        librarians.add(librarian);
    }

    @Override
    public User getUser(String id) {

        return null;
    }

    @Override
    public void update(Librarian librarian) {

    }

    @Override
    public List<Librarian> getAllLibrarian() {
        return null;
    }

    @Override
    public void removeLibrarian(Librarian librarian) {
        librarians.remove(librarian);
    }
}
