package java8way.streams;

import java.util.stream.Stream;

public class DemoStreamOfMethodForGroupingDifferentGroupOfValues {

    public static void main(String[] args) {
        //group of values
        System.out.println("Stream.of() for group of values");
        Stream<Integer> s =  Stream.of(9,99,999,9999,99999);
        s.forEach(System.out::println);

        //for array of values
        System.out.println("Stream.of() for array");
        Double[] d={100d,99d,101d,78d};
        Stream<Double> s1 = Stream.of(d);
        s1.forEach(System.out::println);
    }
}
