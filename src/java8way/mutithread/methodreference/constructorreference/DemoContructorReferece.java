package java8way.mutithread.methodreference.constructorreference;

public class DemoContructorReferece {

    public static void main(String[] args) {
        Interf i = Sample::new;
        i.get();
    }
}
