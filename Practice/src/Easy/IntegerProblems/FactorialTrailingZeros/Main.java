package Easy.IntegerProblems.FactorialTrailingZeros;

public class Main {
    public static void main(String[] args) {

        System.out.println(myTrailingZeroes(10));
        System.out.println(trailingZeroes(10));
    }
    public static int trailingZeroes (int n) {
        int count  = 0;
        for(int i =5 ; i<=5 ; i*= 5){
            count += n/i;
        }
        return count;
    }
    public static int myTrailingZeroes (int n) {
        int count = 0;
        int divider = 5;
        while (n/divider > 0) {
            count += n/divider;
            divider *= 5;
        }
        return count;
    }
}
