package repository;

import model.User;

import java.util.List;

public interface UserRepository {



    public void addUser(User user);
    User getUser(String id);
    void updateUser(User user);
    boolean removeUser(String id);
    List<User> getAllUsers();

}
