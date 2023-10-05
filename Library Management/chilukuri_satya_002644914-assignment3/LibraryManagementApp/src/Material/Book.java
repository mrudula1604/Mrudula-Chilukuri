/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Material;

import java.util.Date;

/**
 *
 * @author chilukuri
 */
public class Book extends Material{

    public Book(String serialNum, String name, Date registeredDate, boolean isAvailable,
            Author author, Genre genre, int numPages, String language, String bindingType) {
        super();
        this.serialNumber = serialNum;
        this.name = name;
        this.registeredDate = registeredDate;
        this.isAvailable = isAvailable;
        this.author = author;
        this.genre = genre;
        this.numPages = numPages;
        this.language = language;
        this.bindingType = bindingType;
    }
    private Author author;
    private Genre genre;
    private int numPages;
    private String language;
    private String bindingType;

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }
    
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    
    
}
