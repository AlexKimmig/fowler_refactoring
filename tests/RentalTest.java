import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RentalTest {

    public static final int DAYS_RENTED = 4;

    private Movie movie;
    private Rental rental;

    @Before
    public void setUp(){
        movie  = new Movie(MovieTest.MOVIE_TITLE1, Movie.REGULAR);
        rental = new Rental(movie, DAYS_RENTED);
    }

    @Test
    public void getMovieTest() {
        assertEquals(rental.getMovie(), movie);
    }

    @Test
    public void getDaysRentedTest() {
        assertEquals(rental.getDaysRented(), DAYS_RENTED);
    }

}