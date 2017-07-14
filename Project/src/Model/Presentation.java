package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by oriol.gut on 16.06.2017.
 */
public class Presentation implements Serializable{
    private String presentationTime;
    private Auditorium auditorium;

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    public String getPresentationTime() {
        return presentationTime;
    }

    public void setPresentationTime(String presentationTime) {
        this.presentationTime = presentationTime;
    }
}
