/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Material;

import Business.Branch;
import Business.Library;
import java.util.ArrayList;

/**
 *
 * @author chilukuri
 */
public class BookDirectory {
    private ArrayList<Book> booksList;
    
    public BookDirectory()
    {
        this.booksList = new ArrayList<Book>();
    }

    public ArrayList<Book> getBooksList() {
        return booksList;
    }

    public void setBooksList(ArrayList<Book> booksList) {
        this.booksList = booksList;
    }
    
    public Book addBook(Book book) {
        this.booksList.add(book);
        return book;
    }
    
    public boolean checkIfBookExists(String serialNumber)
    {
        for(Book b: this.booksList) {
            if(b.getSerialNumber().equals(serialNumber)) {
                return true;
            }
        }
        return false;
    }
    
    public Book findBook(String serialNumber){
        for(Book b: this.booksList) {
            if(b.getSerialNumber().equals(serialNumber)) {
                return b;
            }
        }
        return null;
    }
    
}
