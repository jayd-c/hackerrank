package Easy.IntegerProblems.reverseInteger;

import static java.lang.Integer.MIN_VALUE;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseNumber(756384741));
        System.out.println(MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
    //Given a signed 32-bit integer x, return x with it's digits reversed. If reversing x causes the values to go
    // outside of the signed 32 bit integer range [-2 to the power32, 2to the power 31-1] then return 0;
    public static int reverseNumber (int num) {
        int revNum = 0;
        int min = MIN_VALUE;
        int max = Integer.MAX_VALUE;

        while (num != 0) {
            int lastDigit = num % 10;
            if(revNum > max/10 || (revNum == max/10 && lastDigit > 7) ) return 0;
            if(revNum < min/10 || (revNum == min/10 && lastDigit < -8) ) return 0;
            revNum = revNum*10 + lastDigit;
            num/= 10;
        }
        return revNum;
    }
}
