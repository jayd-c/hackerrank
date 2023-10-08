package Easy.arrays;

import java.util.Arrays;

public class JadenCasing {

    public static void main(String[] args) {

//        System.out.println(jadenCase("How can mirrors be real if our eyes aren't real"));
        System.out.println(jadenCase(""));
    }

    public static String jadenCase (String phrase) {
       if(phrase.contains(" ")){
           String[] strArr = phrase.split(" ");
           String[] newStr = new String[strArr.length];
           String result = "";

           int i = 0;
           for(String str: strArr) {
               String temp = str.substring(0,1).toUpperCase() + str.substring(1);
               newStr[i] = temp;
               i++;
           }
           for(String s: newStr) {
               result += s+" ";
           }
           return result.trim();
       }
       else {
           if(phrase == "") return "";
           else return phrase.substring(0,1).toUpperCase()+ phrase.substring(1);
       }
    }
}
