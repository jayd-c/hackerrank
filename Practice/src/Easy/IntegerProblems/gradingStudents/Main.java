package Easy.IntegerProblems.gradingStudents;

import Easy.IntegerProblems.IsNumberPalindrome.main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(new Integer[] {84,94,21,
                0,
                18,
                100,
                18,
                62,
                30,
                61,
                53,
                0,
                43,
                2,
                29,
                53,
                61,
                40,
                14,
                4,
                29,
                98,
                37,
                23,
                46,
                9,
                79,
                62,
                20,
                38,
                51,
                99,
                59,
                47,
                4,
                86,
                61,
                68,
                17,
                45,
                6,
                1,
                95,
                95}));
//        list.clear();
//        List<Integer> li = new ArrayList<>(List.of(new Integer[]{73,67,38,33}));
//        list.addAll(li);
//        System.out.println(gradingStudents(list));

        System.out.println(gradingStudents(list));

    }
    public static List<Integer> gradingStudents (List<Integer> grades) {
        List<Integer> result = new ArrayList<>();
        for(Integer i: grades) {
            if(i< 38) result.add(i);
            if(i < 40 && i > 37) result.add(40);
            else if(i>=40) {
                if(i % 5 != 0 && (i+1) % 5 == 0) result.add(i+1);
                else if(i % 5 != 0 && (i+2) % 5 == 0) result.add(i+2);
                else result.add(i);

            }


        }
        return result;

    }
}
