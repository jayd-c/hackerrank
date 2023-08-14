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

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int result = 0;
        Collections.sort(a);
        Collections.sort(b);

        List<Integer> aOne = new ArrayList<>();
        List<Integer> aTwo = new ArrayList<>();
        int firstOfB = b.get(0);
        for(int i = 1; i<=firstOfB; i++) {
            if((a.get(0) * i) <= firstOfB){
                aOne.add(a.get(0)*i);
            }
        }
        for(int i = 1; i<=firstOfB; i++) {
            if((a.get(1) * i) <= firstOfB){
                aTwo.add(a.get(1)*i);
            }
        }
        List<Integer> commonInts = new ArrayList<>();
        System.out.println(aOne);
        System.out.println(aTwo);
        for(Integer i: aTwo) {
//            System.out.println("i is " + i);
            if(aOne.contains(i)) {
                commonInts.add(i);
            }
        }
        ArrayList<Integer> resultLIst = new ArrayList<>();
        System.out.println("commonInts = " + commonInts);
        for(Integer j: commonInts){
            for(Integer k: b) {
                if (k % j == 0) resultLIst.add(j);
            }
        }
//        System.out.println("Result list " + resultLIst);
        resultLIst.clear();
        ArrayList<Integer> tempList = new ArrayList<>();
        for(int i = 0; i<commonInts.size(); i++) {
            int item = commonInts.get(i);
            for(int j = 0; j<b.size(); j++) {
                if(b.get(j) % item == 0) {
                    System.out.println(item + " " + b.get(j));
                    tempList.add(b.get(j));

                }
            }
            if(tempList.size() == b.size()) {
                result++;
            }
            tempList.clear();
        }
        return result;
    }


    public static int getTotalX2 (List<Integer> a, List<Integer> b) {

        int result = 0;
        Collections.sort(a);
        Collections.sort(b);

        //get the lcm (lowest common multiplier) of list a
        int lcm = a.get(0);
        for(Integer i: a){
            lcm = Math.min(lcm,i);
        }
        //get thd GCD of all elements of b
        int gcd = b.get(0);
        for(Integer i: b) {
            gcd = Math.max(i,gcd);
        }
        int multiple = 0;
        while(multiple <= gcd) {
            multiple += lcm;
            if(gcd % multiple == 0) result++;
        }
        return result;

    }


}
