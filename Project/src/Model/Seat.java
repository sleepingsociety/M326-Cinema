package Model;

import java.io.Serializable;

/**
 * Created by Oriol Gut on 16.06.2017.
 *
 * This class is responsible for saving the different seats. It's a model class.
 */
public class Seat implements Serializable {
    private String name;
    private SeatStatus isReserved;
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

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
