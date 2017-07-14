package Model;

import java.io.Serializable;

/**
 * Created by Oriol Gut on 16.06.2017.
 *
 * This is an enum class, which has the three different Seat statuses.
 */
public enum SeatStatus implements Serializable{
    Reserved,
    Free,
    Bought
}
