package Easy.Lists;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class BreakingRecords {
    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>(List.of(new Integer[]{10,5,20,20,4,5,2,25,1}));
        Integer[] arr = new Integer[]{3,4,21,36,10,28,35,5,24,42};
        List<Integer> b = new ArrayList<>(List.of(arr));
        System.out.println(breakingRecords(a));
        System.out.println(breakingRecords(b));

    }
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int min = scores.get(0);
        int max = scores.get(0);

        Set<Integer> minSet = new LinkedHashSet<>();
        Set<Integer> maxSet =new LinkedHashSet<>();
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i<=scores.size()-2; i++) {
            int temp = scores.get(i+1);
            if(temp<min) {
                minSet.add(temp);
                min = temp;
            }
            if(temp>max) {
                maxSet.add(temp);
                max = temp;
            }

        }
        result.add(maxSet.size());
        result.add(minSet.size());
        return result;

    }
}
