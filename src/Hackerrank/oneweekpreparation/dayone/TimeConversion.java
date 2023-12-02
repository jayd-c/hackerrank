package Hackerrank.oneweekpreparation.dayone;

import Easy.IntegerProblems.IsNumberPalindrome.main;

public class TimeConversion {
    public static void main(String[] args) {

        System.out.println(timeConversion("12:01:00AM"));

    }
    public static String timeConversion (String s) {
        String hourString = s.substring(0,2);
        int hour = Integer.parseInt(hourString);
        String s1 = s.substring(s.length() - 2, s.length() - 1);
        String s2 = s.substring(2, s.length() - 2);
        if(s1.equalsIgnoreCase("p") && hour!=12) {
            return hour+12 + s2;
        } else if (s1.equalsIgnoreCase("a") && hour==12)
        return "00" + s2;
        else return s.substring(0,s.length()-2);
    }
}
