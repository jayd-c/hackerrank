package Easy.Strings.Sherlock;

import java.util.*;

public class Tester {
    public static void main(String[] args) {

        System.out.println(isValid("abb"));
    }
    public static String isValid(String s) {
        String[] sArr = s.split("");
        Map<String,Integer> resMap = new HashMap<>();

        for(String str: sArr) {
            resMap.put(str,resMap.getOrDefault(str,0)+1);
        }
        List<Integer> list = new ArrayList<>(resMap.values());
        Collections.sort(list);
        System.out.println(list);

        if (list.size() == 1) return "YES";

        int first = list.get(0);
        int second = list.get(1);
        int secondLast =  list.get(list.size() - 2);
        int last = list.get(list.size()-1);


        if (first == last) {
            return "YES";
        }
        if(list.size() == 2) return "NO";

        if (first == 1 && second == last) {
            return "YES";
        }

        if (first == second && second == secondLast && secondLast == (last - 1)) {
            return "YES";
        }

        return "NO";
    }

}
