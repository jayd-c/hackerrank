package CodeWars.sixthkayu;

import Easy.IntegerProblems.IsNumberPalindrome.main;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayDiffs {

    public static void main(String[] args) {

        int[] a = {1,2,2,2,3,};
        int[] b = {2};

        System.out.println(Arrays.toString(arrayDiff(a, b)));


    }

    public static int[] arrayDiff (int[] a, int[]b) {
        List<Integer> resultArrList = new ArrayList<>();
        List<Integer> bList = Arrays.stream(b).mapToObj(Integer::valueOf).collect(Collectors.toList());
//        List<Integer> bList = new ArrayList<>();
//        for(int i: b) bList.add(i);
        for(int j: a) {
            if(!bList.contains(j)) {
                resultArrList.add(j);
            }
        }
        return resultArrList.stream().mapToInt(i->i).toArray();
//        int[] arr = new int[resultArrList.size()];
//        for(int i = 0; i<arr.length; i++) {
//            arr[i] = resultArrList.get(i);
//        }
//        return arr;
    }
}
