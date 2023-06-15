package repository;

import model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepo {

    boolean addUser(User user);
    Optional<User> getUser(String id);
    void updateUser(User user);
    boolean removeUser(String id);
    List<User> getAllUsers();

}
