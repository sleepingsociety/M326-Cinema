package Controller;

import DAL.CreateDemoData;
import DAL.SerializerHelper;
import Model.Auditorium;
import Model.Movie;
import View.AuditoriumView;
import View.MainView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Dominik O'Kerwin on 16.06.2017.
 *
 * This class is the controller for the MainView.
 */
public class Controller {
    // Model
    private Movie movie;

    // View
    private MainView view;
    private ArrayList<Movie> movies;

    public Controller(Movie movie) {
        this.movie = movie;
        this.view = new MainView();
        SerializerHelper serializerHelper = new SerializerHelper();
        movies = serializerHelper.Deserialize();
        if(movie.getMovieTitle() != null || movie.getMovieTitle().equals("")) {
            for(Movie movie1 : movies) {
                if(movie1.getMovieTitle().equalsIgnoreCase(movie.getMovieDescription())) {
                    movie1.setPresentations(movie.getPresentations());
                }
            }
        }
        // Eventhandler registrieren
        view.getBtn1().setOnAction(buttonHandler);
        view.getBtn2().setOnAction(buttonHandler);
        view.getBtn3().setOnAction(buttonHandler);
        view.getBtn4().setOnAction(buttonHandler);
        view.getBtn5().setOnAction(buttonHandler);
        view.getBtn6().setOnAction(buttonHandler);
    }

    EventHandler<ActionEvent> buttonHandler = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            String button = ((Button)event.getSource()).getText();
            ControllerAuditorium controllerAuditorium = null;
            Integer value = null;
            String time = "";
            if(button.contains("Mumie")) {
                value = 0;
                time = button.replace("Mumie ", "");
            } else if(button.contains("Churchill")) {
                value = 1;
                time = button.replace("Churchill ", "");
            } else if(button.contains("Boss Baby")) {
                value = 2;
                time = button.replace("Boss Baby ", "");
            }
            if(value != null){
                movie.setRating(movies.get(value).getRating());
                movie.setMovieLength(movies.get(value).getMovieLength());
                movie.setMovieDescription(movies.get(value).getMovieDescription());
                movie.setMinAge(movies.get(value).getMinAge());
                movie.setMovieTitle(movies.get(value).getMovieTitle());
                movie.setPresentations(movies.get(value).getPresentations());
                controllerAuditorium = new ControllerAuditorium(movie, time);
                controllerAuditorium.show();
            }
        }
    };


    public void show(){
        view.show(movie.getPrimaryStage());
    }
}
