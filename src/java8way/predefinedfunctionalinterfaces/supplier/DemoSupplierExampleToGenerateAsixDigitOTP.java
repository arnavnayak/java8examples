package java8way.predefinedfunctionalinterfaces.supplier;

import java.util.function.Supplier;

/**
 * Created by nayakarn on 10/15/2022.
 */
public class DemoSupplierExampleToGenerateAsixDigitOTP {

    public static void main(String[] args) {
        Supplier<String> s = () -> {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                int x = (int) (Math.random() * 10);
                sb.append(x);
            }
            return sb.toString();
        };
        System.out.println("your generated OTP : "+s.get());
    }
}