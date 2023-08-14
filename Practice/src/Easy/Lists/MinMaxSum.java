package Easy.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(new Integer[] {256741038, 623958417, 467905213, 714532089, 938071625}));
        minMaxSum(list);
    }
    public static void minMaxSum (List<Integer> arr) {
        Collections.sort(arr); {
            long smallTotal = 0L;
            long largeTotal = 0L;
            long tempTotal = 0L;
            for(Integer i: arr) {
                tempTotal += i;
            }
            smallTotal = tempTotal - arr.get(arr.size()-1);
            largeTotal = tempTotal - arr.get(0);
            System.out.println(smallTotal + " " + largeTotal);
        }
    }
}
