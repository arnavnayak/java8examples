package java8way.collections;

import java.util.Map;
import java.util.TreeMap;

public class DemoTreeMap {


    public static void main(String args []) {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(50,"Arnav");
        treeMap.put(20,"NEil");
        treeMap.put(70,"Babunu");
        treeMap.put(1,"Situ");

        System.out.println("default order of sorting of treemap : "+treeMap);

        //customized order of sorting
        Map<Integer, String> treeMapCustomized = new TreeMap<>((o1,o2)->(o1>o2)?-1:(o1<o2)?1:0);
        treeMapCustomized.put(50,"Arnav");
        treeMapCustomized.put(20,"NEil");
        treeMapCustomized.put(70,"Babunu");
        treeMapCustomized.put(1,"Situ");

        System.out.println("customized order of sorting of treemap : "+treeMapCustomized);

    }
}
