package Medium.LongestSubstringWithoutRepeatingCharacters;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
    //https://leetcode.com/problems/longest-substring-without-repeating-characters/
    //Given a string s, find the length of the longest substring without repeating character.
    //NOTE_ substring means substring not words....
    public static int lengthOfLongestSubstring(String s) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length()-1; i++) {
            String temp = s.substring(i,i+1);
            map.put(temp,map.getOrDefault(temp,0)+1);
            System.out.println(temp);
            for(int j = i+1; j < s.length()-1; j++) {
                if(!temp.contains(s.substring(j,j+1))) {
                    temp += s.substring(j);
                    System.out.println(temp);
                }
            }
            map.put(temp, map.getOrDefault(temp,0)+1);
        }
        List<String> list = new ArrayList<>();
        for(Map.Entry<String, Integer> item: map.entrySet()){
            list.add(item.getKey());
        }
        Collections.sort(list);
        return list.get(list.size()-1).length();
    }
}
