
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    public static final String MOVIE_TITLE = "Lord of war";

    private Movie movie;

    @Before
    public void setUp() {
        movie = new Movie(MOVIE_TITLE, Movie.REGULAR);
    }

    @Test
    public void setPriceCodeRegularTest() {
        movie.setPriceCode(Movie.REGULAR);
        assertEquals(movie.getPriceCode(), Movie.REGULAR);
    }

    @Test
    public void setPriceCodeChildrenTest() {
        movie.setPriceCode(Movie.CHILDRENS);
        assertEquals(movie.getPriceCode(), Movie.CHILDRENS);
    }

    @Test
    public void setPriceCodeNewReleaseTest() {
        movie.setPriceCode(Movie.NEW_RELEASE);
        assertEquals(movie.getPriceCode(), Movie.NEW_RELEASE);
    }

    @Test
    public void getTitleTest() {
        assertEquals(movie.getTitle(), MOVIE_TITLE);
    }

}