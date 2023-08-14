package Easy.IntegerProblems.NthRootNumber;

public class Main {
    public static void main(String[] args) {

        System.out.println(getRootNumber(81,2));

    }

    public static double getRootNumber (int x, int n) {
        double error = 0.001;
        //so left is always 1.0 to start
        double left = 1.0;
        //right is the given number for example  x = 27, n = 3 , error = 0.001

        double right =x;
        while ((right - left) > error) {
            //check the middle
            double mid = (left + right)/2.0;
            if(getMultiple(mid,n)< x) {
                left = mid;
            } else {

                right = mid;
            }
        }
        return right;


    }
    private static double getMultiple(double a, int n) {
        double ans = 1.0;
        for(int i = 1; i<=n; i++) {
            ans  *= a;
//            System.out.println("answer : " + ans);
        }
        return ans;
    }
}
