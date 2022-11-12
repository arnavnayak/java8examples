package java8way.collections;

import java.util.ArrayList;
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
        Collections.sort(l, (o1,o2)->(o1>o2) ? -1 : (o1<o2) ? +1 : 0);
        System.out.println("Sorting using LambdaExpression : "+l);
    }


}
