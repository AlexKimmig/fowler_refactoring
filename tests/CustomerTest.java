import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    private final String name = "Alex Kimmig";

    private Movie movie;
    private Rental rental;
    private Customer customer;

    @Before
    public void setUp() {
        movie = new Movie(MovieTest.MOVIE_TITLE1, Movie.NEW_RELEASE);
        rental = new Rental(movie, RentalTest.DAYS_RENTED);
        customer = new Customer(name);
        customer.addRental(rental);
    }

    @Test
    public void getNameTest() {
        assertEquals(name, customer.getName());
    }

    @Test
    public void getStatementTest() {
        String expected = "Rental Record for " + name + "\n" +
                "\tTitle\tDays\tAmount\n" +
                "\t" + movie.getTitle() + "\t\t" + rental.getDaysRented() + "\t12.0\n" +
                "Amount owed is 12.0\n" +
                "You earned 2 frequent renter points";

        String actual = customer.statement();
        assertEquals(expected, actual);
    }

}
