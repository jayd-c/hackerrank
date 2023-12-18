package Hackerrank.oneweekpreparation.dayfour;

import java.util.*;

/*
Given a square grid of characters in the range ascii[a-z], rearrange elements of each row alphabetically, ascending. Determine if the columns are also in ascending alphabetical order, top to bottom. Return YES if they are or NO if they are not.

Example

The grid is illustrated below.

a b c
a d e
e f g
The rows are already in alphabetical order. The columns a a e, b d f and c e g are also in alphabetical order, so the answer would be YES. Only elements within the same row can be rearranged. They cannot be moved to a different row.

Function Description

Complete the gridChallenge function in the editor below.

gridChallenge has the following parameter(s):

string grid[n]: an array of strings
Returns

string: either YES or NO
Input Format

The first line contains , the number of testcases.

Each of the next  sets of lines are described as follows:
- The first line contains , the number of rows and columns in the grid.
- The next  lines contains a string of length

Constraints



Each string consists of lowercase letters in the range ascii[a-z]

Output Format

For each test case, on a separate line print YES if it is possible to rearrange the grid alphabetically ascending in both its rows and columns, or NO otherwise.

Sample Input

STDIN   Function
-----   --------
1       t = 1
5       n = 5
ebacd   grid = ['ebacd', 'fghij', 'olmkn', 'trpqs', 'xywuv']
fghij
olmkn
trpqs
xywuv
Sample Output

YES
Explanation

The x grid in the  test case can be reordered to

abcde
fghij
klmno
pqrst
uvwxy
This fulfills the condition since the rows 1, 2, ..., 5 and the columns 1, 2, ..., 5 are all alphabetically sorted
 */

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
        char[][] charArr = getSortedCharArray(grid);

        for(int i = 0; i<charArr.length; i++) {
            for(int j = 0; j<charArr[0].length; j++ ){
                if(charArr[j][i] < charArr[j][i+1]) return "YES";
            }
        }
       return "NO";

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
