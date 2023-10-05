/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Material;

/**
 *
 * @author chilukuri
 */
public class Genre {
    private String name;
    
    public Genre(String genreName)
    {
        this.name = genreName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return this.getName();
    }
    
}
