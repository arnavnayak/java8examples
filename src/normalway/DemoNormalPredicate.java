package normalway;

public class DemoNormalPredicate {

    public static void main(String[] args){
        TestNormalPredicate t = new TestNormalPredicate();
        System.out.println("result is : "+t.test(100));
        System.out.println("result is : "+t.test(10));
    }
}
class TestNormalPredicate{

    public boolean test(Integer i){
        return i>50;
    }

}