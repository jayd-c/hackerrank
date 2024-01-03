package JPMC;

import java.util.Objects;

public class AlmostEqual {
    public static void main(String[] args) {

        String word1 = "aaaaa";
        String word2 = "aaaaa";

//        String word1 = "aaaa";
//        String word2 = "bccb";

        System.out.println(word2.contains(word1.substring(0)));
        System.out.println(checkAlmostEquivalent3(word1,word2));

    }
    public static boolean checkAlmostEquivalent (String word1, String word2) {
        String[] word1Array = new String[word1.length()];
        String[] word2Array = new String[word2.length()];
        int count = 0;
        Boolean result = false;

        for(int i = 0; i<word1Array.length; i++) {
            for(int j = 0; j< word2Array.length; j++) {
                if(Objects.equals(word1Array[i], word2Array[j])) count++;
            }
            if(count>3) return result;
        }
        return !result;

    }

    public static boolean checkAlmostEquivalent2 (String word1, String word2) {
        char[] wordOne = word1.toCharArray();
        char[] wordTwo = word2.toCharArray();


        int count = 0;

        for(char c: wordOne) {
            for(char ch: wordTwo) {
                if(c == ch) {
                    count++;
                    if(count > 3){
                        System.out.println("c is " + c + " and ch is " + ch + " and count is " + count);

                    }
                }
                System.out.println("*********");
            }
        }
        return false;
    }


    public static boolean checkAlmostEquivalent3 (String word1, String word2) {

        int length = word1.length()-1;

        while (length>=0) {
            int firstCount = 0;
            int secondCount = 0;

            for(int i = 0; i<word1.length(); i++) {
                if(word1.charAt(length) == word1.charAt(i)) {
                    firstCount++;
                }
            }
            for(int j= 0; j<word2.length(); j++) {
                if(word1.charAt(length) == word2.charAt(j)) {
                    secondCount++;
                }
            }
            if(Math.abs(firstCount - secondCount) > 3 && (word2.contains(word1.substring(length)))) {
                return false;
            }
            else {
                length--;
            }
        }
        return true;
    }

}
