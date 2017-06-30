package Model;

import java.util.ArrayList;

/**
 * Created by oriol.gut on 16.06.2017.
 */
public class Movie {
    private int movieLength;
    private String movieTitle;
    private String movieDescription;
    private String rating;
    private int minAge;
    private ArrayList<Presentation> presentations;

    public ArrayList<Presentation> getPresentations() {
        return presentations;
    }

    public void setPresentations(ArrayList<Presentation> presentations) {
        this.presentations = presentations;
    }

    public int getMovieLength() {
        return movieLength;
    }

    public void setMovieLength(int movieLength) {
        this.movieLength = movieLength;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }
}
