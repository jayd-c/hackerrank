package Easy.Strings.Sherlock;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(isValid("abcdefghhgfedecba"));
    }
    public static String isValid (String s) {
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++) {
            String sub = s.substring(i,i+1);
            map.put(sub, map.getOrDefault(sub, 0)+1);
        }
        System.out.println(map);
        List<Integer>  list  = new ArrayList<>();

        for(Map.Entry<String,Integer> item: map.entrySet()) {
                list.add(item.getValue());

        }
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
    public static String isValid2 (String s){
        Map<Character, Integer> charFreqMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int frequency = charFreqMap.getOrDefault(c, 0);
            charFreqMap.put(c, frequency + 1);
        }
        System.out.println(charFreqMap);

        int[] arr = new int[charFreqMap.size()];
        int idx = 0;
        for (Map.Entry<Character, Integer> characterIntegerEntry : charFreqMap.entrySet()) {
            arr[idx++] = characterIntegerEntry.getValue();
        }

        Arrays.sort(arr);
        System.out.println("array 8*****");
        System.out.println(Arrays.toString(arr));
        if (charFreqMap.size() == 1) return "YES";

        int first = arr[0];
        int second = arr[1];
        int secondLast = arr[arr.length - 2];
        int last = arr[arr.length - 1];

        if (first == last) return "YES";

        if (first == 1 && second == last) return "YES";

        if (first == second && second == secondLast && last - secondLast == 1) return "YES";

        return "NO";
    }
}

