package Easy.arrays;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {

        List<Integer> list = List.of(-4,3,-9,0,4,1);
        plusMinus(list);
    }
    public static void plusMinus (List<Integer> list) {
        double plus = 0, minus = 0, zero = 0;
        double plusAvg = 0.0, minusAvg = 0.0, zeroAvg = 0.0;

        for(int i: list) {
            if(i>0) plus++;
            if(i<0) minus++;
            if(i==0) zero++;
        }
        System.out.printf("%f%n",plus / list.size());
        System.out.printf("%f%n",minus/ list.size());
        System.out.printf("%f%n",zero/ list.size());



    }

}
