package View;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;


/**
 * Created by David on 16.06.2017.
 */
public class MainView extends Application {

    private BorderPane bp = new BorderPane();


    Button test = new Button("test");
    Label welcomeText = new Label("Welcome to the Cinema Reservation Program");


    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Booking System");

        HBox hb = new HBox();
        hb.setPadding(new Insets(15, 12, 15, 12));
        hb.setSpacing(10);

        /* Vbox 1 */
        VBox vbox1 = new VBox();
        vbox1.setPadding(new Insets(10, 50, 50, 50));
        vbox1.setSpacing(10);

        Label mov1 = new Label();
        mov1.setText("Movie 1");
        vbox1.getChildren().add(mov1);

        Button btn1 = new Button();
        btn1.setText("Button1");
        vbox1.getChildren().add(btn1);

        Button btn2 = new Button();
        btn2.setText("Button2");
        vbox1.getChildren().add(btn2);

        hb.getChildren().add(vbox1);


        /* Vbox 2 */
        VBox vbox2 = new VBox();
        vbox2.setPadding(new Insets(10, 50, 50, 50));
        vbox2.setSpacing(10);

        Label mov2 = new Label();
        mov2.setText("Movie 2");
        vbox2.getChildren().add(mov2);

        Button btn3 = new Button();
        btn3.setText("Button3");
        vbox2.getChildren().add(btn3);

        Button btn4 = new Button();
        btn4.setText("Button4");
        vbox2.getChildren().add(btn4);

        hb.getChildren().add(vbox2);


        /* Vbox 3 */
        VBox vbox3 = new VBox();
        vbox3.setPadding(new Insets(10, 50, 50, 50));
        vbox3.setSpacing(10);

        Label mov3 = new Label();
        mov3.setText("Movie 3");
        vbox3.getChildren().add(mov3);

        Button btn5 = new Button();
        btn5.setText("Button5");
        vbox3.getChildren().add(btn5);

        Button btn6 = new Button();
        btn6.setText("Button6");
        vbox3.getChildren().add(btn6);

        hb.getChildren().add(vbox3);


        Scene scene = new Scene(hb);
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);


    }
}
