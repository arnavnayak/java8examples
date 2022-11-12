package java8way.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DemoMinAndMaxValueUsingStream {
    public static void main(String[] args) {
        List<Integer> listOfInteger = new ArrayList<>();
        listOfInteger.add(10);
        listOfInteger.add(2);
        listOfInteger.add(8);
        listOfInteger.add(40);
        listOfInteger.add(1);
        System.out.println(listOfInteger);
        int minValue = listOfInteger.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(minValue);
        //for descending order will use customized sorting
        int maxValue= listOfInteger.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(maxValue);
    }
}
