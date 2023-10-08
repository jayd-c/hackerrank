package Easy.Lists;

import java.util.ArrayList;
import java.util.List;

public class Birthday {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(List.of(new Integer[] {1,2,1,3,2}));
//        System.out.println(birthday(l,3,2));
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i<arr.length; i++) {
            for(int j = i; j<3;) {
                System.out.println(arr[i]);
                j+=2;
            }
            System.out.println();
        }

    }

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int result = 0;
        System.out.println(s.size()-m);
        int count = 0;
        for(int i = 0; i<s.size()-(m+1) ; i++) {
            count+=s.get(i);
//            i = s.size()-m;
        }
        System.out.println("count = " + count);
        if(count == d) result++;
        return result;
    }

}
