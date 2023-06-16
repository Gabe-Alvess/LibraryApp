package repository;

import model.Librarian;
import model.User;

import java.util.List;

public class AuthenticationRepository {

    private List<User> usersList;
    private List<Librarian> librarianList;

    public User getUser(String username) {

        // Logic to fetch user from a database
        // Return the User object if found, or null otherwise
        return null;
    }

    public User setUser(String username) {
        //User user = new User();

        //user.setPass
         return new User("asd", "last", "adress", "654", "@emanio", "password");
    }

    public Librarian setLibrarian() {

        return new Librarian("name", "asda", "asdas");
    }
}
