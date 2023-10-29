package CodeWars;

import java.util.*;

public class DeleteNth {

    public static void main(String[] args) {

    }

    public static int[] deleteNth (int[] elements, int maxOccurrences) {

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int element : elements) {
            if (map.containsKey(element)) {
                map.put(element, map.get(element)+1);
                if (map.get(element) <= maxOccurrences) {
                    list.add(element);
                }
            } else {
                map.put(element, 1);
                if (map.get(element) == 1) {
                    list.add(element);
                }
            }

        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
