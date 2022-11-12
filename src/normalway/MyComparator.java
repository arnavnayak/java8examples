package normalway;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        /*if(o1>o2){
            return -1;
        }else if(o1<o2){
            return 1;
        }else {
            return 0;
        }*/

        //the above line can be replaced with ternary operators as:--
        return (o1>o2) ? -1 : (o1<o2) ? +1 : 0;
    }
}
