/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Material;

import Business.UserAccount;
import Role.Role;
import java.util.ArrayList;

/**
 *
 * @author chilukuri
 */
public class AuthorDirectory {
    private ArrayList<Author> authorList;
    
    public AuthorDirectory()
    {
        this.authorList = new ArrayList<Author>();
    }

    public ArrayList<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(ArrayList<Author> authorList) {
        this.authorList = authorList;
    }
    
    public boolean checkIfAuthorExists(String authorName)
    {
        for(Author u: this.authorList) {
            if(u.getAuthorName().equals(authorName)) {
                return true;
            }
        }      
        return false;
    }
    
    public Author findAuthor(String authorName)
    {
        for(Author u: this.authorList) {
            if(u.getAuthorName().equals(authorName)) {
                return u;
            }
        }      
        return null;
    }
    
    public Author createAuthor(String authorName) {
        Author a = new Author(authorName);
        this.authorList.add(a);
        return a;
    }   
}
