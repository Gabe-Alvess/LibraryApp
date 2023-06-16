package repository;

import model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepo {

    boolean addUser(User user);
    Optional<User> getUser(int id);
    boolean removeUser(int id);
    List<User> getAllUsers();

}
