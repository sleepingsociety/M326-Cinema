package Model;

import java.util.ArrayList;

/**
 * Created by oriol.gut on 16.06.2017.
 */
public class Row {
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
