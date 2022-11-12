package java8way.streams;

import java.util.ArrayList;
import java.util.List;

public class DemoToCopyElementFromAStreamToArray {

    public static void main(String[] args) {
        List<Integer> listOfInteger = new ArrayList<>();
        listOfInteger.add(10);
        listOfInteger.add(2);
        listOfInteger.add(8);
        listOfInteger.add(40);
        listOfInteger.add(1);
        System.out.println(listOfInteger);

        Integer[] array = listOfInteger.stream().toArray(Integer[]::new);
        for(Integer i:array){
            System.out.println(i);
        }
    }
}
