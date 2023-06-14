package repository;

import model.User;

import java.util.List;

public class LibraryUserRepository implements UserRepository{

    private List<User> usersList;

    @Override
    public void addUser(User user) {

    }

    @Override
    public User getUser(String id) {
        return null;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public boolean removeUser(String id) {
        return false;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
