package Hackerrank.oneweekpreparation.dayfour;

public class RecurringDigitSum {
    public static void main(String[] args) {

        String n = "9875";

        System.out.println(superDigit(n,4));

    }
    public static int superDigit (String n, int k) {
        long sum = calculateStringSum(n,k);
        while (k>=0) {
            n = String.valueOf(sum);
            k--;
            sum = calculateStringSum(n,1);
        }
        return (int) sum;

    }
    public static long calculateStringSum (String n, int k) {
        long sum = 0;
        for(String intString: n.split("")) {
            sum+= Integer.parseInt(intString);
        }
        return sum * k;
    }
}
