package Easy.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SmallestIntegerFinder {

    public static void main(String[] args) {

        int[] arr = {45,450,48,8,-4545,6};

    }
    public static int findSmallestInt (int[] args) {

          return Arrays.stream(args).boxed().sorted().collect(Collectors.toList()).get(0);

    }
}
