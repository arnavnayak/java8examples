package java8way.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoFindEvenNumberFromCollectionUsingStream {

    public static void main(String[] args) {

        List<Integer> list =  new ArrayList<>();
        list.add(0);
        list.add(25);
        list.add(4);
        list.add(10);
        list.add(5);
        list.add(29);

        List<Integer> newListWithEven = list.stream().filter(l -> l % 2 == 0).collect(Collectors.toList());
        System.out.println(newListWithEven);
    }

}
