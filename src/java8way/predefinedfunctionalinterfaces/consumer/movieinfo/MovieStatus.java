package java8way.predefinedfunctionalinterfaces.consumer.movieinfo;

public class MovieStatus {
    private String movieName;
    private String movieStatus;

    public MovieStatus(String movieName, String movieStatus) {
        this.movieName = movieName;
        this.movieStatus = movieStatus;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieStatus() {
        return movieStatus;
    }

    public void setMovieStatus(String movieStatus) {
        this.movieStatus = movieStatus;
    }
}
