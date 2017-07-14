import Controller.Controller;
import DAL.CreateDemoData;
import DAL.SerializerHelper;
import Model.Movie;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Created by Dominik O'Kerwin on 12.07.2017.
 *
 * This class is the start file, which contains the main method.
 */
public class Start extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // This part of the code is commented and is used to clean the movies.ser file to the original format

        /*
        CreateDemoData createDemoData = new CreateDemoData();
        SerializerHelper serializerHelper = new SerializerHelper();
        serializerHelper.Serialize(createDemoData.createDemoDate());
        System.out.println("done");*/

        // This part of the code is used for the main purpose of the application, which will start the gui

        Movie movie = new Movie(primaryStage);

        // Ersten Controller aufrufen
        Controller mvc = new Controller(movie);
        mvc.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
