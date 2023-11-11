package Easy.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SmallestIntegerFinder {

    public static void main(String[] args) {

        int[] arr = {45,450,48,8,-4545,6};
        System.out.println(findSmallestInt(arr));

    }
    public static int findSmallestInt (int[] args) {
        List<Integer> list = new ArrayList<>();
        list = Arrays.stream(args).boxed().sorted().collect(Collectors.toList());
        return list.get(0);
    }
}
