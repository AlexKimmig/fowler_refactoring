package alexander_kimmig.software_engineering;

public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public double getCosts() {
       return movie.getRentCosts(daysRented);
    }

    public int getFrequentRentalPoints() {
       return movie.getFrequentRentalPoints(daysRented);
    }
}