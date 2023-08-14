package Easy.Lists;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(List.of(new Integer[]{-1, 1, -7, -8}));
        arr.add(List.of(new Integer[]{-10, -8, -5, -2}));
        arr.add(List.of(new Integer[]{0, 9, 7, -1}));
        arr.add(List.of(new Integer[]{4, 4, -2, 1}));

        System.out.println(diagonalDifference(arr));


    }
    public static int diagonalDifference (List<List<Integer>> arr) {
        int firstTotal = 0;
        int secondTotal = 0;

        for(int i = 0; i<arr.size() ; i++) {
            for(int j = 0; j<arr.size(); j++){
                if(i == j) {
//                    System.out.println(arr.get(i).get(j));
                    firstTotal += (int) arr.get(i).get(j);
                }
                if(j == arr.size()-1-i) {
//                    System.out.println(arr.get(i).get(j));
                    secondTotal += (int) arr.get(i).get(j);
                }
            }
        }
        return secondTotal - firstTotal;
    }


}
