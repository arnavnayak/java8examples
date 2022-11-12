package normalway;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DemoComparator {


    public static void main(String args[]){

        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(5);
        l.add(3);
        l.add(20);
        l.add(2);

        System.out.println("Before sorting : "+l);


        //default sorting -- in ascending order
        Collections.sort(l);
        System.out.println("\nafter sorting : "+l);

        //customized sorting -- using comparator
        Collections.sort(l,new MyComparator());
        System.out.println("\nafter  custom sorting : "+l);


    }
}
