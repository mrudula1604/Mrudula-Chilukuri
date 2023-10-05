/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Customer.EmployeeDirectory;
import Material.Author;
import Material.AuthorDirectory;
import Material.BookDirectory;
import Material.GenreDirectory;
import Material.MagazineDirectory;
import Services.RentalRequestDirectory;
import java.util.ArrayList;

/**
 *
 * @author chilukuri
 */
public class Library {
    private int buildingNumber;
    private BookDirectory books;
    private MagazineDirectory magazines;
    private AuthorDirectory authors;
    private GenreDirectory genres;
    private EmployeeDirectory employees;
    RentalRequestDirectory rentals;

    public RentalRequestDirectory getRentals() {
        return rentals;
    }

    public void setRentals(RentalRequestDirectory rentals) {
        this.rentals = rentals;
    }

    public EmployeeDirectory getEmployees() {
        return employees;
    }

    public void setEmployees(EmployeeDirectory employees) {
        this.employees = employees;
    }
    
    public Library(int buildingNumber){
        this.buildingNumber = buildingNumber;
        this.authors = new AuthorDirectory();
        this.genres = new GenreDirectory();
        this.books = new BookDirectory();
        this.employees = new EmployeeDirectory();
        this.magazines = new MagazineDirectory();
        this.rentals = new RentalRequestDirectory();
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public BookDirectory getBooks() {
        return books;
    }

    public void setBooks(BookDirectory books) {
        this.books = books;
    }

    public MagazineDirectory getMagazines() {
        return magazines;
    }

    public void setMagazines(MagazineDirectory magazines) {
        this.magazines = magazines;
    }

    public AuthorDirectory getAuthors() {
        return authors;
    }

    public void setAuthors(AuthorDirectory authors) {
        this.authors = authors;
    }

    public GenreDirectory getGenres() {
        return genres;
    }

    public void setGenres(GenreDirectory genres) {
        this.genres = genres;
    }
    
    
    
}
