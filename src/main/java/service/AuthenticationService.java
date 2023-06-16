package service;

import model.User;
import repository.AuthenticationRepository;

public class AuthenticationService {

    private AuthenticationRepository authRepository;

    public AuthenticationService() {
        this.authRepository = new AuthenticationRepository();
    }

    public boolean authenticateUser(String username, String password) {
        User user = authRepository.getUser(username);
        if (user != null && user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }
}
