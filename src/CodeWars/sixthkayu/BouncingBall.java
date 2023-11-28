package CodeWars.sixthkayu;

public class BouncingBall {
    /*
    How many times will the mother see the ball pass in front of her window (including when it's falling and bouncing)?

Three conditions must be met for a valid experiment:
Float parameter "h" in meters must be greater than 0
Float parameter "bounce" must be greater than 0 and less than 1
Float parameter "window" must be less than h.
If all three conditions above are fulfilled, return a positive integer, otherwise return -1.

Note:
The ball can only be seen if the height of the rebounding ball is strictly greater than the window parameter.

Examples:
- h = 3, bounce = 0.66, window = 1.5, result is 3

- h = 3, bounce = 1, window = 1.5, result is -1

(Condition 2) not fulfilled).
     */

    public static void main(String[] args) {

        System.out.println(bouncingBall(3.0,0.66,1.5));

    }
    public static int bouncingBall (double h, double bounce, double window) {
        if(h<0 || (bounce <=0 || bounce >=1 ) || window > h) return  -1;
        else if(h*bounce <= window) return -1;
        else {
            int count = 1;
            while (h>0) {
                if(h*bounce > window) {
                    count+=2;
                }
                h *= bounce;
                if(h<window) break;
            }
            return count;
        }
    }
}
