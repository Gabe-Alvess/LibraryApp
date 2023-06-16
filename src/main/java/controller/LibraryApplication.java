package controller;

import model.Book;
import model.User;
import service.AuthenticationService;
import service.BookService;
import service.BorrowedBookService;

import java.util.Optional;
import java.util.Scanner;


public class LibraryApplication {

    //this is our instance of BBS
        static BorrowedBookService borrowedBookService = BorrowedBookService.getInstance();

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to the Library Application!");
        System.out.println("Please select an option:");
        System.out.println("1. Login as User");
        System.out.println("2. Login as Admin");
        int choice = scanner.nextInt();

        if (choice == 1) {
            loginAsUser();
        } else if (choice == 2) {
            loginAsAdmin();
        } else {
            System.out.println("Invalid choice. Exiting...");
        }


        User newUser = new User(
                "Gigi", "Kent", "address", "5555", "email@email", "password");

        // can you call ?
        // user is asking to borrow a book -> first check to see if the book exist in the DB

        Optional<Book> borrowBook = borrowedBookService.borrowBook(newUser, "book name");

        if (borrowBook.isPresent()) {
            System.out.println(borrowBook.get().getName() + " " + borrowBook.get().getAuthor()  + "borrowed");
        } else {
            System.out.println("Book " + "book name" + " doesn't exists");
        }


    }

    public static void loginAsAdmin() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Login as Admin");
        System.out.println("Do you have an account? (yes/no)");
        String hasAccount = scanner.nextLine();

        if (hasAccount.equalsIgnoreCase("yes")) {
            System.out.println("Please enter your username:");
            String username = scanner.nextLine();

            System.out.println("Please enter your password:");
            String password = scanner.nextLine();

            // Authenticate admin
            AuthenticationService authService = new AuthenticationService();
            boolean isAuthenticated = authService.authenticateUser(username, password);

            if (isAuthenticated) {
                System.out.println("Admin authentication successful!");
                //TODO Continue with admin functionality
            } else {
                System.out.println("Admin authentication failed. Invalid username or password.");
            }
        } else {
            System.out.println("You don't have an account. Please create an account.");
            //TODO Code for user registration goes here
        }
    }

    public static void loginAsUser() {
        //TODO Code for user must be TODO
        Scanner scanner = new Scanner(System.in);

        System.out.println("Login as User");
        System.out.println("Do you have an account? (yes/no)");
        String hasAccount = scanner.nextLine();

        if (hasAccount.equalsIgnoreCase("yes")) {
            System.out.println("Please enter your username:");
            String username = scanner.nextLine();

            System.out.println("Please enter your password:");
            String password = scanner.nextLine();

            // Authenticate user
            AuthenticationService authService = new AuthenticationService();
            boolean isAuthenticated = authService.authenticateUser(username, password);

            if (isAuthenticated) {
                System.out.println("User authentication successful!");
                // Continue with user-specific functionality
            } else {
                System.out.println("User authentication failed. Invalid username or password.");
            }
        } else {
            System.out.println("Create an account.");
            signupUser();
            // Code for user registration goes here
        }
    }

    public static void signupUser() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Create user account");
        System.out.println("Please insert first name");
        String firstName = scanner.nextLine();



    }
}
