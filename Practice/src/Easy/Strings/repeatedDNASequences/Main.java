package Easy.Strings.repeatedDNASequences;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //see below how substring works
//        System.out.println("123456789abcdef".substring(0,10));
        //
        String s = "aaaaacccccaaaaaccccccaaaaagggttt";
        System.out.println(s.length());
        String ss = "abcdefghijklm";
        Map<String,Integer> map = new HashMap<>();
        map.put("ayya",0);
        map.put("malli",0);
        map.put("akka",0);
        map.put("amma",0);
        System.out.println(map.values());
        System.out.println(map);

        System.out.println(findRepeatedDnaSequence3(ss));

    }
    //this is using hashset.
    public static List<String> findRepeatedDnaSequence (String s) {
        Set<String> existingSet = new HashSet<>();
        Set<String> resultSet = new HashSet<>();
        //Key formula -> s.substring(i,i+10) to extract the 10 letter strings
        //then set.add() to insert, remember set is cannot have duplicates. so any duplicate will be added to second set.
        for(int i = 0; i<= s.length()-10; i++) {
            String temp = s.substring(i, i+10);
            if(!existingSet.contains(temp)) existingSet.add(temp);
            else resultSet.add(temp);
        }
        return new ArrayList<>(resultSet);

    }
    public static List<String> findRepeatedDnaSequence3 (String s) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length() - 10; i++) {
            String subString = s.substring(i, i + 10);
            //getOrDefault will return
            map.put(subString, map.getOrDefault(subString, 0) + 1);
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            if (item.getValue() > 1) {
                list.add(item.getKey());
            }
        }
        return list;
    }
    //this method using map/hashmap and my solution using .contains method
    public static List<String> findRepeatedDnaSequence2 (String s) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0 ; i<s.length()-10; i++) {
            String subStr = s.substring(i,i+10);

            map.put(subStr, map.containsKey(subStr)? 1 : 0);
        }
        List<String> list = new ArrayList<>();
        for(Map.Entry<String,Integer> item: map.entrySet()) {
            if(item.getValue() == 1) {
                list.add(item.getKey());
            }
        }
        return list;
    }
}

