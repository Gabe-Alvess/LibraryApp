package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {

    private String ID;
    private String firstName;
    private String lastName;
    private String address;
    private String postCode;
    private String email;
    private String password;
    private List<BorrowedBook> borrowedBookUserList;


    public User(String firstName, String lastName, String address, String postCode, String email, String password) {
        setFirstName(firstName);
        setLastName(lastName);
        setAddress(address);
        setPostCode(postCode);
        setEmail(email);
        setPassword(password);
        this.borrowedBookUserList = new ArrayList<>();
    }
    public void setFirstName(String firstName) {
        if (!firstName.isEmpty()){
            this.firstName = firstName;
                }
        }
    public void setLastName(String lastName) {
        if (!lastName.isEmpty()){
            this.lastName = lastName;
        }
    }
    public void setAddress(String address) {
        if (!address.isEmpty()){
        this.address = address;
        }
    }

    public void setPostCode(String postCode) {
        if (!postCode.isEmpty()){
            this.postCode = postCode;
        }
    }

    public void setEmail(String email) {
        if (email.contains("@") && email.contains(".")
                && email.indexOf("@") == email.lastIndexOf("@")
                && email.lastIndexOf("@") < email.lastIndexOf(".")){
            this.email = email;
        }
    }

    //TODD
    // change password if user forgot the password
    private void setPassword(String password) {
        if (!firstName.isEmpty()){
            this.password = password;
        }
    }

    public String getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() { return password; }

    public List<BorrowedBook> getBorrowedBookUserList() {
     return new ArrayList<>(borrowedBookUserList);
    }

    @Override
    public String toString() {
        return "User{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", postCode='" + postCode + '\'' +
                ", email='" + email + '\'' +
                ", borrowedBooks=" + borrowedBookUserList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(ID, user.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }
}
