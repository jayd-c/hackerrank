package Easy.IntegerProblems.TwoSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twosum(arr,target)));
        //You have given an int[] array, and a target... now check how you get target by adding only two elements from the array
        //assume:- only one sum of two elements exists in the array.
    }

    public static int[] twosum(int[] nums, int target) {

        List<int[]> list = new ArrayList<>();
        int[] intArr= new int[2];
        for(int i = 0; i<nums.length; i++) {
            for(int j = 0; j<nums.length; j++) {
                if(i != j && nums[i]+ nums[j] == target) {
                  list.add(new int[]{i,j});
                }
            }
        }

            intArr = list.get(0);

        return intArr;
    }
}
