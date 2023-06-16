package service;

import model.User;
import repository.AuthenticationRepository;

import java.util.Optional;

public class AuthenticationService {

    private AuthenticationRepository authRepository;
    private static AuthenticationService authenticationService;

    public AuthenticationService() {
        this.authRepository = new AuthenticationRepository();
    }

    public static AuthenticationService getInstance() {
        if (authenticationService == null) {
            authenticationService = new AuthenticationService();
        }
        return authenticationService;
    }

    public boolean authenticateUser(String username, String password) {
        Optional<User> user = authRepository.getUser(username);
        return user.isPresent() && user.get().getPassword().equals(password);
    }


    // pass all fields
    public boolean signUpUser(String email, String userName, String password) {

        return authRepository.registerUser(email, userName, password);
    }
}
