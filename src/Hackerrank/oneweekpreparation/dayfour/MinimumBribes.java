package Hackerrank.oneweekpreparation.dayfour;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumBribes {
    /*
    It is New Year's Day and people are in line for the Wonderland rollercoaster ride. Each person wears a sticker indicating their initial position in the queue from  to . Any person can bribe the person directly in front of them to swap positions, but they still wear their original sticker. One person can bribe at most two others.

Determine the minimum number of bribes that took place to get to a given queue order. Print the number of bribes, or, if anyone has bribed more than two people, print Too chaotic.

Example


If person  bribes person , the queue will look like this: . Only  bribe is required. Print 1.


Person  had to bribe  people to get to the current position. Print Too chaotic.

Function Description

Complete the function minimumBribes in the editor below.

minimumBribes has the following parameter(s):

int q[n]: the positions of the people after all bribes
Returns

No value is returned. Print the minimum number of bribes necessary or Too chaotic if someone has bribed more than  people.
Input Format

The first line contains an integer , the number of test cases.

Each of the next  pairs of lines are as follows:
- The first line contains an integer , the number of people in the queue
- The second line has  space-separated integers describing the final state of the queue.

Constraints

Subtasks

For  score
For  score

Sample Input

STDIN       Function
-----       --------
2           t = 2
5           n = 5
2 1 5 3 4   q = [2, 1, 5, 3, 4]
5           n = 5
2 5 1 3 4   q = [2, 5, 1, 3, 4]
Sample Output

3
Too chaotic
Explanation

Test Case 1

The initial state:

pic1(1).png

After person  moves one position ahead by bribing person :

pic2.png

Now person  moves another position ahead by bribing person :

pic3.png

And person  moves one position ahead by bribing person :

pic5.png

So the final state is  after three bribing operations.

Test Case 2

No person can bribe more than two people, yet it appears person  has done so. It is not possible to achieve the input state.
     */
    public static void main(String[] args) {
        Integer[] arr = {1,2,5,3,7,8,6,4};
        List<Integer> list = Arrays.stream(arr).collect(Collectors.toList());


        minimumBribes4(list);
    }

    public static void minimumBribes (List<Integer> q) {
        List<Integer> actual = getActualList(q);
        System.out.println(actual);
        System.out.println(q);
        int tempSum = 0;
        boolean flag = false;
        for(int i =0; i<q.size(); i++) {
            int temp = q.get(i) - actual.get(i);
            if(temp>2){
                System.out.println("Too chaotic");
                flag = true;
                break;
            } if(temp>=0){
                tempSum += temp;
            }
        }
        if(!flag) System.out.println(tempSum);

    }

    public static List<Integer> getActualList (List<Integer> list) {
        List<Integer> actual = new ArrayList<>();
        for(int i = 1; i<=list.size(); i++)actual.add(i);
        return actual;
    }

    public static void minimumBribes2 (List<Integer> q) {
        int numBribes = 0;
        boolean chaotic = false;

        // loop through this bribed array named q
        for (int i=0; i < q.size(); i++){
            int ogPos = i+1;                // original i
            int change = q.get(i)-ogPos;

            // CASE 1: too many changes
            if ( change > 2){
                System.out.println("Too chaotic");
                chaotic = true;
                break;
            }

            // CASE 2: changes have been made
            if ( change > 0){
                numBribes = numBribes + change;
            }

            // CASE 3: no changes // we do nothing
        }
        // loop has ended

        if (!chaotic){
            System.out.println(numBribes);
        }
    }
    static void minimumBribes3(int[] q) {

        int numBribes = 0;
        boolean chaotic = false;

        // loop through this bribed array named q
        for (int i=0; i < q.length; i++){
            int ogPos = i+1;                // original i
            int change = q[i]-ogPos;

            // CASE 1: too many changes
            if ( change > 2){
                System.out.println("Too chaotic");
                chaotic = true;
                break;
            }

            // CASE 2: changes have been made
            if ( change > 0){
                numBribes = numBribes + change;
            }

            // CASE 3: no changes we do nothing
        }
        // the loop has ended

        if (!chaotic){
            System.out.println(numBribes);
        }
    }
        //this is the correct answer.
        public static void minimumBribes4(List<Integer> q) {
            // Write your code here
            int cnt = 0;
            for(int i=q.size()-1; i>=0; i--){
                if(q.get(i) - (i+1) > 2) {
                    System.out.println("Too chaotic");
                    return;
                }

                for(int j=Math.max(0, q.get(i) - 2); j<=i; j++){
                    if(q.get(j) > q.get(i)) {
                        System.out.println(" j " + j + " i " + i);
                        System.out.println("q.get(j) : " + q.get(j) + " q.get(i) : " + q.get(i));
                        cnt++;
                        System.out.println(" count **********" + cnt);
                    }
                }
            }
            System.out.println(cnt);
        }


        public static void minimumBribes5 (List<Integer> q) {
            Integer[] arr = {1,2,3,4,5,6,7,8};
            List<Integer> original = Arrays.stream(arr).collect(Collectors.toList());
            int count = 0;
            for(int i = 0; i<q.size(); i++) {
                if(q.get(i) != original.get(i)) {
                    count += q.indexOf(q.get(i)) - (original.get(i));
                }
            }
            System.out.println(count);
        }

}
