package View;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import javafx.event.ActionEvent;



/**
 * Created by David on 16.06.2017.
 */
public class MainView extends Application {

    Stage stage = new Stage();



    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
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
        btn1.setOnAction((ActionEvent e) -> {
            auditoriumView(btn1.getText(), mov1.getText());
        });
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

    void auditoriumView(String movieTitle, String movieTime) {
        VBox rows = new VBox();

        HBox rowA = new HBox();
        HBox rowB = new HBox();
        HBox rowC = new HBox();
        HBox rowD = new HBox();
        HBox rowE = new HBox();

        rowA.setPadding(new Insets(15, 50, 15, 50));
        rowB.setPadding(new Insets(15, 50, 15, 50));
        rowC.setPadding(new Insets(15, 50, 15, 50));
        rowD.setPadding(new Insets(15, 50, 15, 50));
        rowE.setPadding(new Insets(15, 50, 15, 50));


        Button A1 = new Button("A1");
        Button A2 = new Button("A2");
        Button A3 = new Button("A3");
        Button A4 = new Button("A4");
        Button A5 = new Button("A5");
        Button A6 = new Button("A6");
        Button A7 = new Button("A7");
        Button A8 = new Button("A8");

        Button B1 = new Button("B1");
        Button B2 = new Button("B2");
        Button B3 = new Button("B3");
        Button B4 = new Button("B4");
        Button B5 = new Button("B5");
        Button B6 = new Button("B6");
        Button B7 = new Button("B7");
        Button B8 = new Button("B8");

        Button C1 = new Button("C1");
        Button C2 = new Button("C2");
        Button C3 = new Button("C3");
        Button C4 = new Button("C4");
        Button C5 = new Button("C5");
        Button C6 = new Button("C6");
        Button C7 = new Button("C7");
        Button C8 = new Button("C8");

        Button D1 = new Button("D1");
        Button D2 = new Button("D2");
        Button D3 = new Button("D3");
        Button D4 = new Button("D4");
        Button D5 = new Button("D5");
        Button D6 = new Button("D6");
        Button D7 = new Button("D7");
        Button D8 = new Button("D8");

        Button E1 = new Button("E1");
        Button E2 = new Button("E2");
        Button E3 = new Button("E3");
        Button E4 = new Button("E4");
        Button E5 = new Button("E5");
        Button E6 = new Button("E6");
        Button E7 = new Button("E7");
        Button E8 = new Button("E8");

        rowA.getChildren().addAll(A1, A2, A3, A4, A5, A6, A7, A8);
        rowB.getChildren().addAll(B1, B2, B3, B4, B5, B6, B7, B8);
        rowC.getChildren().addAll(C1, C2, C3, C4, C5, C6, C7, C8);
        rowD.getChildren().addAll(D1, D2, D3, D4, D5, D6, D7, D8);
        rowE.getChildren().addAll(E1, E2, E3, E4, E5, E6, E7, E8);

        rows.getChildren().addAll(rowA, rowB, rowC, rowD, rowE);

        BorderPane bp = new BorderPane();

        Label mvTitle = new Label(movieTitle);
        Label time = new Label(movieTime);


        HBox topText = new HBox();

        topText.setPadding(new Insets(5, 50, 15, 50));

        topText.getChildren().addAll(mvTitle, time);

        bp.setTop(topText);

        bp.setCenter(rows);


        Scene auditoriumScene = new Scene(bp);
        stage.setScene(auditoriumScene);
        stage.show();
    }
}
