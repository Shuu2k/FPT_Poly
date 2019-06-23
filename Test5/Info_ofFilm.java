/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test5;

import java.io.Serializable;

/**
 *
 * @author Dell
 */
public class Info_ofFilm implements Serializable {
    
    private String filmCategory;
    private String filmName;
    private String filmStudio;
    private String studioMail;
    private String releaseDate;

    public String getFilmCategory() {
        return filmCategory;
    }

    public void setFilmCategory(String filmCategory) {
        this.filmCategory = filmCategory;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmStudio() {
        return filmStudio;
    }

    public void setFilmStudio(String filmStudio) {
        this.filmStudio = filmStudio;
    }

    public String getStudioMail() {
        return studioMail;
    }

    public void setStudioMail(String studioMail) {
        this.studioMail = studioMail;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Info_ofFilm() {
    }
}
