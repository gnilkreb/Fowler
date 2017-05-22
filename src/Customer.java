
import java.lang.*;
import java.util.*;

class Customer {
    private String name;
    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.addElement(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        //add footer lines
        result += "Amount owed is " + getTotalCharge() + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }

    private double getTotalCharge() {
        int frequentRenterPoints = 0;
        Enumeration enum_rentals = rentals.elements();
        double totalAmount = 0;

        while (enum_rentals.hasMoreElements()) {
            double result = 0;
            Enumeration rentals = this.rentals.elements();
            while (rentals.hasMoreElements()) {
                Rental each = (Rental) rentals.nextElement();
                result += each.getCharge();
            }
            return result;
        }
    }
}
    