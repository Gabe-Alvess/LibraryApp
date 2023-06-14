package model;

import java.util.Date;
import java.util.Objects;

public class Book {

    private String ID;
    private String name;
    private String author;
    private String ISBN;
    private int specimenNumber;
    private String gender;
    private boolean isAvailable;
    private Date releaseDate;

    public Book(String name, String author, String ISBN, int specimenNumber, String gender, Date releaseDate) {
        setID(specimenNumber);
        this.name = name;
        this.author = author;
        this.specimenNumber = specimenNumber;
        this.ISBN = ISBN;
        this.gender = gender;
        this.releaseDate = releaseDate;
    }

    //TODO
    // ID made from ISBN + Specimen Book Number - Check if ok ?
    private void setID(int specimenNumber) {
        this.ID = getISBN() + "-" + specimenNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setSpecimenNumber(int specimenNumber) {
        this.specimenNumber = specimenNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getSpecimenNumber() {
        return specimenNumber;
    }

    public String getGender() {
        return gender;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", gender='" + gender + '\'' +
                ", isAvailable=" + isAvailable +
                ", releaseDate=" + releaseDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return specimenNumber == book.specimenNumber && Objects.equals(ISBN, book.ISBN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, specimenNumber);
    }
}
