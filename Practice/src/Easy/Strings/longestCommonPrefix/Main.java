package Easy.Strings.longestCommonPrefix;

//["flowers","flee","flying"] in this array longest common prefix is "fl" _
/*
get the first element of the array as your prefex. and then use
  e.g. "hello".indexOf("h") this is always zero because "h" is the first letter and it allways contains in the
  first letter
  e.g. "Hello".indexOf("He") => 0;
       "Hello".indexOf("el") => 1;
       it can be a letter or a matching sequence of charactors which starts is the inedexOf that letter

 */

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"flowers","flow","flying"};
        String pr = arr[0];
        System.out.println(pr.indexOf("pr"));
        System.out.println(longestCommonPrefix(arr));

    }
    public static String longestCommonPrefix (String[] strArr) {
        if(strArr.length == 0 || Objects.equals(strArr[0], "")) return "";
        String prefix = strArr[0];
        for(int i = 1; i<strArr.length; i++) {
            while(strArr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0,prefix.length() -1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
