package java8way.predefinedfunctionalinterfaces.function;

import java.util.Locale;
import java.util.function.Function;

public class DemoFunctionExampleFiveChaining {

    public static void main(String[] args) {
        Function<String, String> f1 = s -> s.toUpperCase();
        Function<String, String> f2 = s -> s.substring(0, 5);

        System.out.println(f1.andThen(f2).apply("ArnavNayak"));
        System.out.println(f1.compose(f2).apply("ArnavNayak"));
    }
}
