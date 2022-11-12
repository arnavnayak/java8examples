package java8way.streams;

import java.util.ArrayList;
import java.util.List;

public class DemoForEachProcessingInStream {

    public static void main(String[] args) {
        List<String> listNames = new ArrayList<>();
        listNames.add("Arnav");
        listNames.add("babunu");
        listNames.add("ArnavNayak");
        listNames.add("Neil");
        listNames.add("NeilArnav");

        System.out.println("printing elements:--");
        listNames.stream().forEach(n->System.out.println(n));

        System.out.println("printing elements with method reference:--");
        listNames.stream().forEach(System.out::println);
    }
}
