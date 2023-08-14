package Easy.IntegerProblems.HappyNumber;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println(isHappy(19));

    }
    public static boolean isHappy (int n) {
        Set<Integer> list = new HashSet<>();
        while (n != 1) {
            int current = n;
            int sum = 0;
            while (current != 0) {
                int rem  = current % 10;
                sum += (rem * rem);
                current/=10;
            }
            if(list.contains(sum)) {
                return false;
            }
            n = sum;
            list.add(n);
        }
        return true;
    }

}
