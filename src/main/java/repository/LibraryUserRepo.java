package repository;

import model.User;

import java.util.List;
import java.util.Optional;

public class LibraryUserRepo implements UserRepo {

    private List<User> usersList;



    @Override
    public boolean addUser(User user) {
        return usersList.add(user);
    }

    @Override
    public Optional<User> getUser(String id) {

        //  throws
        Optional<User> optionalUser = usersList.stream()
                .filter(user -> user.getID().equalsIgnoreCase(id))
                .findFirst();

        return optionalUser;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public boolean removeUser(String id) {

        Optional<User> optionalUser =  usersList.stream()
                    .filter(user -> user.getID().equalsIgnoreCase(id))
                    .findAny();

        return optionalUser.map(user -> usersList.remove(user)).orElse(false);
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }


}
