package Hackerrank.oneweekpreparation.daytwo;

import java.util.*;

public class LonelyInteger {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,3,2,1);
        System.out.println(lonelyInteger(list));

    }
    public static int lonelyInteger (List<Integer> a) {
        Set<Integer> returnSet = new HashSet<>();

        Set<Integer> set = new HashSet<>(a);
        for(int i: a) {
            if(!returnSet.add(i)) set.remove(i);
        }
        int result = 0;
        for(int s: set) {
            result = s;
        }
        return result;
    }
}
