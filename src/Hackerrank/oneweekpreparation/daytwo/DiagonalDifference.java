package Hackerrank.oneweekpreparation.daytwo;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(0,new ArrayList<>(List.of(1,2,3)));
        list.add(1,new ArrayList<>(List.of(4,5,6)));
        list.add(2,new ArrayList<>(List.of(9,8,9)));

//        System.out.println(list.size());
//        System.out.println(list.get(0).get(2));
        System.out.println(diagonalDifference(list));

    }
    public static int diagonalDifference (List<List<Integer>> arr) {
        int firstDiagonal = 0;
        int secondDiagonal = 0;

        for(int i = 0; i<arr.size(); i++) {
            firstDiagonal += (arr.get(i).get(i));
            secondDiagonal += arr.get(arr.size()-(i+1)).get(i);
        }
        return Math.abs(firstDiagonal-secondDiagonal);


    }
}
