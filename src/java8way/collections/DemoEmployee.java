package java8way.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class DemoEmployee {

    public static void main(String args []){

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(100,"Arnav"));
        employeeList.add(new Employee(50,"Neil"));
        employeeList.add(new Employee(60,"Babuunu"));
        employeeList.add(new Employee(10,"Situ"));

        System.out.println("Employee before sorting : "+employeeList);
        //after sorting
        Collections.sort(employeeList,(o1,o2)->(o1.getEno()<o2.getEno())?-1:(o1.getEno()>o2.getEno())?1:0);
        System.out.println("Employee after increasing order of eno sorting : "+employeeList);

        Collections.sort(employeeList,(o1,o2)->(o1.getEno()>o2.getEno())?-1:(o1.getEno()<o2.getEno())?1:0);
        System.out.println("Employee after decreasing order of eno sorting : "+employeeList);
    }
}
