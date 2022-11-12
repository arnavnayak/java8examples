package java8way.predefinedfunctionalinterfaces.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class DemoSupplierExampleReturnSystemDate {

    public static void main(String[] args){
        Supplier<Date> s = ()->new Date();
        System.out.println("System date is "+s.get());
    }

}
