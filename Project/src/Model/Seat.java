package Model;

/**
 * Created by oriol.gut on 16.06.2017.
 */
public class Seat {
    private String name;
    private SeatStatus isReserved;

    public SeatStatus getIsReserved() {
        return isReserved;
    }

    public void setIsReserved(SeatStatus isReserved) {
        this.isReserved = isReserved;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
