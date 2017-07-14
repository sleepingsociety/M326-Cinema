import Controller.Controller;
import DAL.CreateDemoData;
import DAL.SerializerHelper;
import Model.Movie;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Created by Jethif on 12.07.2017.
 */
public class Start extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        /*
        CreateDemoData createDemoData = new CreateDemoData();
        SerializerHelper serializerHelper = new SerializerHelper();
        serializerHelper.Serialize(createDemoData.createDemoDate());
        System.out.println("done");*/
        Movie movie = new Movie(primaryStage);

        // Ersten Controller aufrufen
        Controller mvc = new Controller(movie);
        mvc.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
