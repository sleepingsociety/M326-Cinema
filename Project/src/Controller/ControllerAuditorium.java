package Controller;

import DAL.SerializerHelper;
import Model.*;
import View.AuditoriumView;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;

/**
 * Created by Dominik O'Kerwin on 12.07.2017.
 *
 * This class is the controller for the AuditoriumView.
 */
public class ControllerAuditorium {
    private Movie movie;
    private String time;
    // View
    private AuditoriumView view;
    private ArrayList<Movie> movies;

    public ControllerAuditorium(Movie movie, String time) {
        this.time = time;
        this.movie = movie;
        this.view = new AuditoriumView(movie, time);
        // Eventhandler registrieren
        for(Button button : view.getButtons()) {
            if(button.isDisable() == true) {
                button.setStyle("-fx-base: #aaaaaa;");
                button.setDisable(false);
            } else {
                button.setOnAction(buttonHandler);
            }

        }
        view.getSaveButton().setOnAction(buttonHandler);
        view.getGoBackButton().setOnAction(buttonHandler);
    }

    EventHandler<ActionEvent> buttonHandler = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            String button = ((Button)event.getSource()).getText();

            if(button.equalsIgnoreCase("Save Reservation")) {
                /**
                 * This part will save all the changes in the file and go back in the MainView
                 */

                SerializerHelper serializerHelper = new SerializerHelper();
                ArrayList<Movie> movies = new ArrayList<>();
                movies = serializerHelper.Deserialize();
                for(int i = 0; i < movies.size(); i++) {
                    if(movie.getMovieTitle().equalsIgnoreCase(movies.get(i).getMovieTitle())) {
                        System.out.println("Changed Presentation");
                        movies.get(i).setPresentations(movie.getPresentations());
                    }
                }
                serializerHelper.Serialize(movies);

                Controller controller = new Controller(movie);
                controller.show();
            } else if(button.equalsIgnoreCase("Go Back")) {
                /**
                 * This part will just go back to the MainView and won't save any changes.
                 */


                Controller controller = new Controller(movie);
                controller.show();
            } else {
                /**
                 * This part will open a dialog box, which the user can reserve a place temporarily
                 */

                Customer customer = new Customer();
                Dialog<Customer> dialog = new Dialog<>();
                dialog.setTitle("Reserve Seat " + button);
                dialog.setHeaderText("Please fill out these fields");


                ButtonType btnCreate = new ButtonType("Reserve place", ButtonBar.ButtonData.OK_DONE);
                dialog.getDialogPane().getButtonTypes().addAll(btnCreate, ButtonType.CANCEL);

                // Create the username and password labels and fields.
                GridPane grid = new GridPane();
                grid.setHgap(10);
                grid.setVgap(10);
                grid.setPadding(new Insets(20, 150, 10, 10));

                TextField fullName = new TextField();
                fullName.setPromptText("Max Muster");
                TextField telephoneNumber = new TextField();
                telephoneNumber.setPromptText("+41 76 131 13 42");

                grid.add(new Label("Full name:"), 0, 0);
                grid.add(fullName, 1, 0);
                grid.add(new Label("Telephone number:"), 0, 1);
                grid.add(telephoneNumber, 1, 1);

                dialog.getDialogPane().setContent(grid);

                // Request focus on the username field by default.
                Platform.runLater(telephoneNumber::requestFocus);

                // Convert the result to a username-password-pair when the login button is clicked.
                dialog.setResultConverter(dialogButton -> {
                    if (dialogButton == btnCreate) {
                        customer.setCustomerPhoneNumber(telephoneNumber.getText());
                        customer.setCustomerName(fullName.getText());
                        for (int i = 0; i < movie.getPresentations().size(); i++) {

                            if (movie.getPresentations().get(i).getPresentationTime().equals(time)) {
                                System.out.println(time);
                                for (int j = 0; j < movie.getPresentations().get(i).getAuditorium().getRows().size(); j++) {
                                    if (movie.getPresentations().get(i).getAuditorium().getRows().get(j).getRowName().equalsIgnoreCase(String.valueOf(button.charAt(0)))) {
                                        for (int k = 0; k < movie.getPresentations().get(i).getAuditorium().getRows().get(j).getSeats().size(); k++) {
                                            if (movie.getPresentations().get(i).getAuditorium().getRows().get(j).getSeats().get(k).getName().equalsIgnoreCase((String.valueOf(button.charAt(1))))) {
                                                System.out.println("Test");
                                                movie.getPresentations().get(i).getAuditorium().getRows().get(j).getSeats().get(k).setCustomer(customer);
                                                movie.getPresentations().get(i).getAuditorium().getRows().get(j).getSeats().get(k).setIsReserved(SeatStatus.Reserved);
                                                ((Button) event.getSource()).setStyle("-fx-base: #aaaaaa;");
                                                ((Button) event.getSource()).setOnAction(null);
                                                Tooltip tooltip = new Tooltip(customer.getCustomerName() + " " + customer.getCustomerPhoneNumber());
                                                ((Button) event.getSource()).setTooltip(tooltip);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                return null;
            });

            Optional<Customer> result = dialog.showAndWait();

            result.ifPresent(usernamePassword -> {

            });
            }
        }
    };


    public void show(){
        view.show(movie.getPrimaryStage());
    }
}
