package Model;

import java.io.Serializable;

/**
 * Created by oriol.gut on 16.06.2017.
 */
public class Customer implements Serializable {
    private String customerName;
    private String customerPhoneNumber;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
