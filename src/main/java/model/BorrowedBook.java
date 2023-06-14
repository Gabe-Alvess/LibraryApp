package model;

import java.util.Date;
import java.util.Objects;

public class BorrowedBook {

    private User user;
    private Book book;
    private Date dueDate;
    private Date borrowDate;
    private boolean hasFine;
    private double fineAmount;

    public BorrowedBook(User user, Book book, Date dueDate, Date borrowDate) {
        this.user = user;
        this.book = book;
        this.dueDate = dueDate;
        this.borrowDate = borrowDate;
        this.hasFine = false;
        this.fineAmount = 0.00;
    }

    //TODO
    // SetUser must be private ? cannot change user ? only if needed ?
    private void setUser(User user) {
        this.user = user;
    }

    //TODO
    // setBook must be private ? cannot change book ? only if needed ?
    private void setBook(Book book) {
        this.book = book;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    private void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public void setHasFine(boolean hasFine) {
        this.hasFine = hasFine;
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public boolean isHasFine() {
        return hasFine;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    @Override
    public String toString() {
        return "BorrowedBook{" +
                "user=" + user +
                ", book=" + book +
                ", dueDate=" + dueDate +
                ", borrowDate=" + borrowDate +
                ", hasFine=" + hasFine +
                ", fineAmount=" + fineAmount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BorrowedBook that = (BorrowedBook) o;
        return Objects.equals(user, that.user) && Objects.equals(book, that.book) && Objects.equals(dueDate, that.dueDate) && Objects.equals(borrowDate, that.borrowDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, book, dueDate, borrowDate);
    }
}
