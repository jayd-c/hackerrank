package Hackerrank.oneweekpreparation;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);
        miniMaxSum(list);

    }

    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        BigInteger bd = new BigInteger("0");
        for(Integer i: arr) {
            bd =  bd.add(BigInteger.valueOf(i));
        }
        System.out.println(bd);
    }
}
