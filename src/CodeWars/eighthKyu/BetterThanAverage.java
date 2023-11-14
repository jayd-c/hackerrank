package CodeWars.eighthKyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BetterThanAverage {
    public static void main(String[] args) {

        int[] t = {5,5,5,5,5};
        System.out.println(betterThanAverage(t,5));
    }
    public static boolean betterThanAverage (int[] classPoints, int yourPoints) {
        double sum = Arrays.stream(classPoints).sum() + yourPoints;
        double avg = sum/(double) (classPoints.length + 1);
        return  avg < yourPoints;

    }

    public static boolean betterThanAvg (int[] classPoints, int yourPoints) {
        return (double) (Arrays.stream(classPoints).sum() + yourPoints)/classPoints.length +1 < yourPoints;
    }
}
