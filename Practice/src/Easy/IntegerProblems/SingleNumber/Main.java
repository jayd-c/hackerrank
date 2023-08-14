package Easy.IntegerProblems.SingleNumber;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       int[] arr = {2,2,1};

        System.out.println(getSingleNumber(arr));
        System.out.println(getSingleWithXOROperator(arr));

    }
    public static int getSingleNumber (int[] arr) {
        if(arr.length == 1) return arr[0];
        Set<Integer> set = new HashSet<>();
        for (int j : arr) {
            if (set.contains(j)) {
                set.remove(j);
            } else {
                set.add(j);
            }
        }
        return set.iterator().next();
    }
    public static int getSingleWithXOROperator (int[] arr) {
        int ans = arr[0];
        for(int i = 1; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
