package Easy.Strings.alternatingCharaters;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(AlternatingCharacters.minDeletion("AAABBB"));
//        System.out.println(log("Time to write a grade code"));
    }
    public static int alternatingCharacters (String s) {
      String[] strArr = s.split("");
      int count = 0;
      for(int i = 0; i<strArr.length-1; i++) {
          if(strArr[i].equals(strArr[i+1])) {
              count++;
          }
      }
      return count;
    }
    public static String log (String s) {
        String[] arr = s.split(" ");
        List<String> wordList = new ArrayList<>();
        String result = "";
        for(String st: arr) {
            if(st.length() % 2 == 0) {
                wordList.add(st);
            }
        }
        if(wordList.isEmpty()) result  = "00";
        else {
            for(String w: wordList) {
                if(result.length()< w.length()){
                    result = w;
                }
            }
        }
        if(s == "") result = "00";
        return result;
    }
}
