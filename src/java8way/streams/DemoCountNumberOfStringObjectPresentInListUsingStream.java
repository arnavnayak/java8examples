package java8way.streams;

import java.util.ArrayList;
import java.util.List;

public class DemoCountNumberOfStringObjectPresentInListUsingStream {

    public static void main(String[] args) {
        List<String> listNames = new ArrayList<>();
        listNames.add("Arnav");
        listNames.add("babunu");
        listNames.add("ArnavNayak");
        listNames.add("Neil");
        listNames.add("NeilArnav");

        long countOfNames = listNames.stream().filter(n -> n.length() > 5).count();
        System.out.println(countOfNames);
    }
}
