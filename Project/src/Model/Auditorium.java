package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Oriol Gut on 16.06.2017.
 *
 * This class is the auditorium which is a model
 */
public class Auditorium implements Serializable {
    private ArrayList<Row> rows;
    private String auditoriumName;

    public ArrayList<Row> getRows() {
        return rows;
    }

    public void setRows(ArrayList<Row> rows) {
        this.rows = rows;
    }

    public String getAuditoriumName() {
        return auditoriumName;
    }

    public void setAuditoriumName(String auditoriumName) {
        this.auditoriumName = auditoriumName;
    }
}
