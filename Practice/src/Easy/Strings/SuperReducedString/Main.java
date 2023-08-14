package Easy.Strings.SuperReducedString;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String s  = "aaabccddd";
        superReducedString(s);
    }
    public static void superReducedString(String s) {

        String temp = "";
        String result = "";
        int length = s.length();
        String[] arr = s.split("");
        while (length>0) {
            for(int i = 0; i<length-1; i++) {
                if(arr[i].equals(arr[i+1])) {
                    temp = arr[i]+arr[i+1];
                    System.out.println(temp);
                    result = s.substring(0,i) + s.substring(i+2,s.length());
                    System.out.println(result);
                    s=result;
                    length -= 2;
                }
                if(i<length-1) break;
            }
        }

    }
}
