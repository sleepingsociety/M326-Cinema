package View;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javafx.event.ActionEvent;



/**
 * Created by David on 16.06.2017.
 */
public class MainView {
    private Scene scene;
    private GridPane grid;

    public void show(Stage stage) {
        stage.setTitle("Booking System");
        stage.setScene(scene);
        stage.show();
    }

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;

    public MainView() {
        grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        HBox hb = new HBox();
        hb.setPadding(new Insets(15, 12, 15, 12));
        hb.setSpacing(10);

        /* Vbox 1 */
        VBox vbox1 = new VBox();
        vbox1.setPadding(new Insets(10, 50, 50, 50));
        vbox1.setSpacing(10);

        Label mov1 = new Label();
        mov1.setText("Die Mumie");
        vbox1.getChildren().add(mov1);

        btn1 = new Button();
        btn1.setText("Mumie 15:30");
        vbox1.getChildren().add(btn1);

        btn2 = new Button();
        btn2.setText("Mumie 18:30");
        vbox1.getChildren().add(btn2);

        hb.getChildren().add(vbox1);

        /* Vbox 2 */
        VBox vbox2 = new VBox();
        vbox2.setPadding(new Insets(10, 50, 50, 50));
        vbox2.setSpacing(10);

        Label mov2 = new Label();
        mov2.setText("Churchill");
        vbox2.getChildren().add(mov2);

        btn3 = new Button();
        btn3.setText("Churchill 15:30");
        vbox2.getChildren().add(btn3);

        btn4 = new Button();
        btn4.setText("Churchill 20:15");
        vbox2.getChildren().add(btn4);

        hb.getChildren().add(vbox2);

        /* Vbox 3 */
        VBox vbox3 = new VBox();
        vbox3.setPadding(new Insets(10, 50, 50, 50));
        vbox3.setSpacing(10);

        Label mov3 = new Label();
        mov3.setText("The Boss Baby");
        vbox3.getChildren().add(mov3);

        btn5 = new Button();
        btn5.setText("Boss Baby 18:30");
        vbox3.getChildren().add(btn5);

        btn6 = new Button();
        btn6.setText("Boss Baby 20:15");
        vbox3.getChildren().add(btn6);

        hb.getChildren().add(vbox3);

        grid.getChildren().add(hb);

        scene = new Scene(grid);
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public GridPane getGrid() {
        return grid;
    }

    public void setGrid(GridPane grid) {
        this.grid = grid;
    }

    public Button getBtn1() {
        return btn1;
    }

    public void setBtn1(Button btn1) {
        this.btn1 = btn1;
    }

    public Button getBtn2() {
        return btn2;
    }

    public void setBtn2(Button btn2) {
        this.btn2 = btn2;
    }

    public Button getBtn3() {
        return btn3;
    }

    public void setBtn3(Button btn3) {
        this.btn3 = btn3;
    }

    public Button getBtn4() {
        return btn4;
    }

    public void setBtn4(Button btn4) {
        this.btn4 = btn4;
    }

    public Button getBtn5() {
        return btn5;
    }

    public void setBtn5(Button btn5) {
        this.btn5 = btn5;
    }

    public Button getBtn6() {
        return btn6;
    }

    public void setBtn6(Button btn6) {
        this.btn6 = btn6;
    }
}
