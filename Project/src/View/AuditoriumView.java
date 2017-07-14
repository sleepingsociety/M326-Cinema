package View;

import Model.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Created by david on 16.06.17.
 */
public class AuditoriumView {
    private Scene scene;
    private GridPane grid;
    private Movie movie;
    private Button saveButton;

    public void show(Stage stage) {
        stage.setTitle("Auditorium View");
        stage.setScene(scene);
        stage.show();
    }

    ArrayList<Button> buttons = new ArrayList<>();
    Button goBackButton;


    public AuditoriumView(Movie movie, String time) {
        grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

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

        String[] letters = {"A", "B", "C", "D", "E"};

        ArrayList<Presentation> presentations = movie.getPresentations();
        Auditorium auditorium = null;
        for(Presentation presentation : presentations) {
            if(presentation.getPresentationTime().equals(time)) {
                auditorium = presentation.getAuditorium();
            }
        }
        ArrayList<Seat> seats = new ArrayList<>();

        for(Row row : auditorium.getRows()) {
            for(Seat seat : row.getSeats()) {
                seats.add(seat);
            }
        }

        for(int i = 0; i < letters.length; i++) {
            for(int j = 0; j < 8; j++) {
                Button button = new Button(letters[i] + (j+1));
                if(SeatStatus.Reserved == seats.get(buttons.size()).getIsReserved()) {
                    button.setTooltip(new Tooltip(seats.get(buttons.size()).getCustomer().getCustomerName() + " " + seats.get(buttons.size()).getCustomer().getCustomerPhoneNumber()));
                    button.setDisable(true);
                }
                buttons.add(button);
            }
        }

        for(int i = 0; i < 40; i++) {
            if(i < 8) {
                rowA.getChildren().add(buttons.get(i));
            } else if(i < 16) {
                rowB.getChildren().add(buttons.get(i));
            } else if(i < 24) {
                rowC.getChildren().add(buttons.get(i));
            } else if(i < 32) {
                rowD.getChildren().add(buttons.get(i));
            } else if(i < 40) {
                rowE.getChildren().add(buttons.get(i));
            }
        }
        rows.getChildren().addAll(rowA, rowB, rowC, rowD, rowE);

        saveButton = new Button("Save Reservation");

        BorderPane bp = new BorderPane();

        Label mvTitle = new Label(movie.getMovieTitle());
        mvTitle.setPadding(new Insets(10, 10, 10, 10));
        Label timeLabel = new Label(time);
        timeLabel.setPadding(new Insets(10, 10, 10, 10));
        Label auditoriumLabel = new Label(auditorium.getAuditoriumName());
        auditoriumLabel.setPadding(new Insets(10, 10, 10, 10));

        HBox topText = new HBox();

        topText.setPadding(new Insets(5, 50, 15, 50));

        topText.getChildren().addAll(mvTitle, timeLabel, auditoriumLabel);

        bp.setTop(topText);

        bp.setCenter(rows);

        goBackButton = new Button("Go Back");
        HBox hBox = new HBox();
        hBox.setSpacing(40);
        hBox.getChildren().add(goBackButton);
        hBox.getChildren().add(saveButton);

        bp.setBottom(hBox);


        grid.getChildren().add(bp);

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

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public ArrayList<Button> getButtons() {
        return buttons;
    }

    public void setButtons(ArrayList<Button> buttons) {
        this.buttons = buttons;
    }

    public Button getSaveButton() {
        return saveButton;
    }

    public void setSaveButton(Button saveButton) {
        this.saveButton = saveButton;
    }

    public Button getGoBackButton() {
        return goBackButton;
    }

    public void setGoBackButton(Button goBackButton) {
        this.goBackButton = goBackButton;
    }
}
