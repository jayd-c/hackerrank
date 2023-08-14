package Easy.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.jar.JarOutputStream;

public class BetweenTwoSets {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>(List.of(new Integer[] {2,4}));
        List<Integer> b = new ArrayList<>(List.of(new Integer[] {16,32,96}));

        System.out.println(getTotalX(a,b));

    }

    private static int getGcd (int one, int two) {
        if(two == 0) return one;
        else {
        return getGcd(two, one%two);
        }
    }

    private static int getLcm (int one, int two) {
        if(one == 0 || two == 0) {
            return 0;
        } else {
            int gcd = getGcd(one,two);
            return Math.abs(one * two / gcd);

        }
    }

    public static int getTotalX (List<Integer> a, List<Integer> b) {

        int result = 0;
        Collections.sort(a);
        Collections.sort(b);

        //get the lcm (lowest common multiplier) of list a
        int lcm = a.get(0);
        for(Integer i: a){
           lcm = getLcm(lcm,i);
        }
        //get thd GCD of all elements of b
        int gcd = b.get(0);
        for(Integer i: b) {
            gcd = getGcd(gcd,i);
        }
        int multiple = 0;
        while(multiple <= gcd) {
            multiple += lcm;
            if(gcd % multiple == 0) result++;
        }
        return result;

    }


}
