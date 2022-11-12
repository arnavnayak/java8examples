package java8way.predefinedfunctionalinterfaces.supplier;
import java.util.function.Supplier;

/**
 * Created by nayakarn on 10/15/2022.
 */
public class DemoSupplierExampleToGenereateRandomSixNumberLikeDice {

    public static void main(String[] args) {
        Supplier<Integer> s = () -> {
            Integer[] diceArray = {1, 2, 3, 4, 5, 6};
            int randomValueGenerator = (int) (Math.random() * 6);  //multiplied by 6 because math.random generate value between 0 to 0.9999 hence
            return diceArray[randomValueGenerator];
        };

        System.out.println("Dice rolled First Time!! result is "+s.get());
        System.out.println("Dice rolled Second Time!! result is "+s.get());
        System.out.println("Dice rolled Third Time!! result is "+s.get());
    }

}