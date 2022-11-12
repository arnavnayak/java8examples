package java8way.predefinedfunctionalinterfaces.consumer.movieinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DemoMovieCast {

    public static void main(String[] args){

        List<Movie> movieCastList = new ArrayList<>();
        populate(movieCastList);
        Consumer<Movie> movieConsumer = m->System.out.println(m);
        for(Movie movie : movieCastList) {
            movieConsumer.accept(movie);
        }
    }

    private static void populate(List<Movie> movieCastList) {

        movieCastList.add(new Movie("Bahubali","prabhash","Anushka"));
        movieCastList.add(new Movie("Krish","Hrithik","Priyanka"));

    }
}
