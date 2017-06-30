package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Jethif on 16.06.2017.
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
