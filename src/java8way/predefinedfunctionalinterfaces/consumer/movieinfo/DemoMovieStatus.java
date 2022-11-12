package java8way.predefinedfunctionalinterfaces.consumer.movieinfo;

import java.util.function.Consumer;

public class DemoMovieStatus {

    public static void main(String[] args){
        Consumer<MovieStatus> c1 =  m->System.out.println("is released!!");
        Consumer<MovieStatus> c2 = m->System.out.println(m.getMovieName() + " is " + m.getMovieStatus());
        Consumer<MovieStatus> c3 = m->System.out.println(m.getMovieName() + " information storing in DB!!");
        Consumer<MovieStatus> chainedConsumer = c1.andThen(c2).andThen(c3);

        chainedConsumer.accept(new MovieStatus("Bahubali","Hit"));
        chainedConsumer.accept(new MovieStatus("Krish","Flop"));
    }
}
