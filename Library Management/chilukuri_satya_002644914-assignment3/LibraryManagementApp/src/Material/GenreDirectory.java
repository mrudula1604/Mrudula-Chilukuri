/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Material;

import java.util.ArrayList;

/**
 *
 * @author chilukuri
 */
public class GenreDirectory {
    private ArrayList<Genre> genres;
    
    public GenreDirectory()
    {
        this.genres = new ArrayList<Genre>();
    }

    public ArrayList<Genre> getGenres() {
        return genres;
    }

    public void setGenres(ArrayList<Genre> genres) {
        this.genres = genres;
    }
    
    public boolean checkIfGenreExists(String genreName)
    {
        for(Genre g: this.genres) {
            if(g.getName().equals(genreName)) {
                return true;
            }
        }      
        return false;
    }
    
    public Genre findGenre(String genreName)
    {
        for(Genre u: this.genres) {
            if(u.getName().equals(genreName)) {
                return u;
            }
        }      
        return null;
    }
    
    public Genre createGenre(String genreName) {
        Genre g = new Genre(genreName);
        this.genres.add(g);
        return g;
    }
}
