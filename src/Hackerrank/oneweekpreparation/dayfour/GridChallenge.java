package Hackerrank.oneweekpreparation.dayfour;

import java.util.*;
import java.util.stream.Collectors;

public class GridChallenge {
    public static void main(String[] args) {

//        String a = "edbcda";
//        String[] aArr  = a.split("");
//        Arrays.sort(aArr);
//        System.out.println(Arrays.toString(aArr));

        String[] str = {"ebacd", "fghij", "olmkn", "trpqs", "xywuv"};
        String[] str2 = {"bac", "lmp", "qrt"};
        String[] str3 = {"mpxz","abcd","wlmf"};
        List<String> grid = new ArrayList<>(List.of(str3));


        System.out.println(gridChallenge(grid));

        for(char[] chars: getSortedCharArray(grid)) {
            System.out.println(Arrays.toString(chars));
        }




    }
    public static String gridChallenge (List<String> grid) {
        char[][] charArr = new char[grid.size()][grid.get(0).length()];
        for(int i = 0; i< grid.size(); i++) {
            for(int j = 0; j<grid.get(i).length(); j++) {
                char[] temp = grid.get(i).toCharArray();
                Arrays.sort(temp);
                charArr[i][j] = temp[j];
            }

            }
            for(int col = 0; col<charArr.length; col++) {
                for (int row = 1; row < charArr.length; row++) {
                    if ((int)charArr[row][col] < (int) charArr[row - 1][col]) return "NO";
                }

            }
        return "YES";

        }

    public static String gridChallenge2 (List<String> grid) {
       ArrayList<String> al = new ArrayList<>();
       for(int i = 0; i<grid.size(); i++) {
           char[] chars = grid.get(i).toCharArray();
           Arrays.sort(chars);
           al.add(Arrays.toString(chars));
       }

       int size = al.get(0).length();
       for(int i = 1; i<al.size(); i++) {
           for(int j = 0; j<size; j++) {
               if(al.get(i-1).charAt(j) > al.get(i).charAt(j)) {
                   return "NO";
               }
           }
       }
       return "YES";
    }

    public static char[][] getSortedCharArray  (List<String> list) {
        char[][] charArr = new char[list.size()][list.get(0).length()];
        for(int i = 0; i< charArr.length; i++) {
            for(int j = 0; j<list.get(i).length(); j++) {
                char[] temp = list.get(i).toCharArray();
                Arrays.sort(temp);
                charArr[i][j] = temp[j];

            }
        }
        return charArr;
    }


}
