package CodeWars.seventKyu;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Isogram {
    public static void main(String[] args) {

        System.out.println(isIsogram2("mose"));

    }
    public static boolean isIsogram (String str) {
        if(str.isEmpty()) return true;
        else{
            int temp = 0;
            for(String s: str.split("")) {
                for(String ss: str.split("")) {
                   if (s.equalsIgnoreCase(ss)) temp++;
                }
                if(temp >1) return false;
                temp = 0;
            }
        }
        return true;
}

public static boolean isIsogram2 (String str) {
        return str.toLowerCase().chars().distinct().count() == str.length();
}
}
