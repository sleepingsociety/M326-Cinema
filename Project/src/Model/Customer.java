package Model;

import java.io.Serializable;

/**
 * Created by Oriol Gut on 16.06.2017.
 *
 * This class is used to save the Customers with telephone number and name. This is a model class
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
