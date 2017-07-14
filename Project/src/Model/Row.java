package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Oriol Gut on 16.06.2017.
 *
 * This class is a model class for saving the rows.
 */
public class Row implements Serializable {
    private ArrayList<Seat> seats;
    private String rowName;

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    public String getRowName() {
        return rowName;
    }

    public void setRowName(String rowName) {
        this.rowName = rowName;
    }
}
