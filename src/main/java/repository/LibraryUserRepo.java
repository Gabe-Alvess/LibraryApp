package repository;

import model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LibraryUserRepo implements UserRepo {

    private final List<User> usersList;

    public LibraryUserRepo() {
        usersList = new ArrayList<>();
    }

    @Override
    public boolean addUser(User user) {
        return usersList.add(user);
    }

    @Override
    public Optional<User> getUser(int id) {
        return usersList.stream().filter(user -> user.getID() == id).findFirst();
    }

    @Override
    public boolean removeUser(int id) {
        Optional<User> optionalUser = usersList.stream().filter(user -> user.getID() == id).findAny();

        return optionalUser.map(usersList::remove).orElse(false);
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(usersList);
    }


}
