/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Material;

/**
 *
 * @author chilukuri
 */
public class Author {
    private String authorName;
    
    public Author(String authorName)
    {
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    
    @Override
    public String toString(){
        return this.authorName;
    }
    
}
