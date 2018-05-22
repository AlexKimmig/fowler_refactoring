
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {

    public static final String MOVIE_TITLE1 = "Lord of war";
    public static final String MOVIE_TITLE2 = "This \u0601 not a movie";


    private Movie movie1;
    private Movie movie2;

    @Before
    public void setUp() {
        movie1 = new Movie(MOVIE_TITLE1, Movie.REGULAR);
        movie2 = new Movie(MOVIE_TITLE2, Movie.CHILDRENS);
    }

    @Test
    public void setPriceCodeRegularTest() {
        movie1.setPriceCode(Movie.REGULAR);
        assertEquals(movie1.getPriceCode(), Movie.REGULAR);
    }

    @Test
    public void setPriceCodeChildrenTest() {
        movie1.setPriceCode(Movie.CHILDRENS);
        assertEquals(movie1.getPriceCode(), Movie.CHILDRENS);
    }

    @Test
    public void setPriceCodeNewReleaseTest() {
        movie1.setPriceCode(Movie.NEW_RELEASE);
        assertEquals(movie1.getPriceCode(), Movie.NEW_RELEASE);
    }

    @Test
    public void getTitleTest() {
        assertEquals(movie1.getTitle(), MOVIE_TITLE1);
        assertEquals(movie2.getTitle(), MOVIE_TITLE2);
    }

}