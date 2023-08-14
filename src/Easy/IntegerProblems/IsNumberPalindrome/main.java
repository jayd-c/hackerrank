package Easy.IntegerProblems.IsNumberPalindrome;

public class main {
    public static void main(String[] args) {
        System.out.println(isPalindromeMySolution(12321));
        System.out.println(isPalindrome(12321));
        System.out.println(reverseMySolution(3200));
    }

    public static boolean isPalindrome(int x) {
        //check if x is negative,
        //check if the number ends with zero other than single digit zero
        if(x <=0 || (x != 0 && x%10 == 0)) {
            return false;
        }
        int reverse = 0;
        int temp = x;
        while (temp > reverse) {
            int lastDigit = temp *  10;
            reverse = reverse * 10 + lastDigit;
            temp/=10;
        }
        return temp/10 == reverse || temp == reverse;

    }
    //this is my solution below ........................................

    public static int reverseMySolution(int number) {
        int rev = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            rev = rev * 10 + lastDigit;
            number/=10;

        }
        return rev;
    }
    public static boolean isPalindromeMySolution (int x) {
        int revNumber = reverseMySolution(x);
        return revNumber == x;
    }
}
