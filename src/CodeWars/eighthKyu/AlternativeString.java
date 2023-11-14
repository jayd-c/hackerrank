package CodeWars.eighthKyu;

import java.util.Arrays;
import java.util.stream.Collectors;

import static java.lang.Character.isUpperCase;

public class AlternativeString {
    public static void main(String[] args) {
        System.out.println(toAlternativeString("kkaK"));

    }
    public static String toAlternativeString (String string) {
      String[] strArr = string.split("");
      String result = "";
      for(String s: strArr) {
          if(isUpperCase(s.charAt(0))) {
              result+=s.toLowerCase();
          } else result += s.toUpperCase();
      }
      return result;
    }
}
