package Medium.LongestSubstringWithoutRepeatingCharacters;

public class Fibonacci {

    public static void main(String[] args) {

        printFibonacciSeqFromNth(10);

        double[] arr = getFibonacciArrFromNth(10);
//        for(double d: arr) System.out.println(d);

    }
    public static void printFibonacciSeqFromNth (int n) {
        int num1 = 1;
        int num2 = 1;
        int num3 = 1;
        int counter = 0;
        while (counter < n) {
            System.out.println(num1 + "");
            int num4 = num3 + num2 + num1;
            num1 = num2;
            num2 = num3;
            num3 = num4;
            counter = counter+1;
        }
    }

    public static double[] getFibonacciArrFromNth (int n) {
        double[] arr = new double[n];
        int num1 = 0;
        int num2 = 1;
        int counter = 0;
        while (counter < n) {
            arr[counter] = num1;
            int num3  = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
        return  arr;
    }

    public static double[] getFib (double[] s, int n) {
        double num1 = s[0];
        double num2 = s[1];
        double num3 = s[2];
        int counter = 0;
        double[] resultArr = new double[n];
        while(counter < n) {
            resultArr[counter] = num1;
            double num4 = num1 + num2 + num3;
            num1 = num2;
            num2 = num3;
            num3 = num4;
            counter++;
        }
        return  resultArr;
    }

}
