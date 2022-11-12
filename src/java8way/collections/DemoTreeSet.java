package java8way.collections;

import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet {

    public static void main(String args[]){
        Set<Integer> tree = new TreeSet<>();
        tree.add(20);
        tree.add(1);
        tree.add(3);
        tree.add(2);
        tree.add(8);
        tree.add(2);

        System.out.println("without customize sorting returns default sorting order : "+tree);

        //customize sorting need to pass comparator impl in TreeSet<>()
        Set<Integer> customizeTree = new TreeSet<>((o1,o2)->(o1>o2)?-1:(o1<o2)?1:0);
        customizeTree.add(20);
        customizeTree.add(1);
        customizeTree.add(3);
        customizeTree.add(2);
        customizeTree.add(8);
        customizeTree.add(2);

        System.out.println("with customize sorting returns customized sorting order : "+customizeTree);


    }



}
