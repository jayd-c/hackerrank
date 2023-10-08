package CodeWars;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Object[] arr = {"Keep", "Remove", "Keep", "Remove", "Keep"};
       for (Object a:  removeEveryOther(arr)){
           System.out.println(a);
       }

        System.out.println(cockSpeed(1.08));

    }
    public static Object[] removeEveryOther(Object[] arr) {
        List<Object> list = new ArrayList<>();

        for(int i = 0; i<arr.length; i++) {
            if(i%2==0) {
                list.add(arr[i]);
                System.out.println(arr[i]);

            }
        }
        return list.toArray();

    }

    public static String updateLight (String current) {
        return current=="green"?"yellow":(current=="yellow"?"red": (current=="red"?"green":"red"));
    }

    public static int cockSpeed (double x) {
       double newDist =  x*100000/3600;
       return (int) newDist;
    }
}
