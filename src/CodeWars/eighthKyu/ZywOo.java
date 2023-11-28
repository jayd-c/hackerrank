package CodeWars.eighthKyu;

import java.util.Arrays;

public class ZywOo {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(take2(arr, 2)));

    }
    public static int[] take(int[] arr, int n) {
        if(arr.length == 0 || arr.length < n) return arr;
        else {
            int[] result = new int[n];
            for(int i = 0; i<result.length; i++) {
                result[i] = arr[i];
            }
            return result;
        }
    }


    public static int[] take2 (int[] arr, int n) {
        return Arrays.copyOf(arr,n);
    }



}
