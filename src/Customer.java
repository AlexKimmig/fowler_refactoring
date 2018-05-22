
import java.lang.*;
import java.util.*;

class Customer {
    private String name;
    private Vector rentals = new Vector();

    public Customer(String newname) {
        name = newname;
    }

    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = this.rentals.elements();
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "Days" + "\t" + "Amount" + "\n";

        while (rentals.hasMoreElements()) {
            Rental currentRental = (Rental) rentals.nextElement();

            // add frequent renter points
            frequentRenterPoints += currentRental.getFrequentRentalPoints();

            //show figures for this rental
            result += "\t" + currentRental.getMovie().getTitle() + "\t" + "\t" + currentRental.getDaysRented() + "\t" + String.valueOf(currentRental.getCosts(currentRental)) + "\n";
            totalAmount +=  currentRental.getCosts(currentRental);
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }
}
    