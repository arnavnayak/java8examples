package java8way.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoSortingUsingProcessorInStream
{
    public static void main(String[] args) {

        List<Integer> listOfInteger = new ArrayList<>();
        listOfInteger.add(10);
        listOfInteger.add(2);
        listOfInteger.add(8);
        listOfInteger.add(40);
        listOfInteger.add(1);
        System.out.println(listOfInteger);
        List<Integer> sortedList = listOfInteger.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        //for descending order will use customized sorting
        List<Integer> sortedListDescending = listOfInteger.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println(sortedListDescending);
    }


}
