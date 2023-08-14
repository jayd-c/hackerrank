package Easy.IntegerProblems.CountApplesAndOranges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter s,t,a,b...");
        String sAndT = scanner.nextLine();
        String[] firstInput = sAndT.split(",");
        int s = Integer.parseInt(firstInput[0]);
        int t = Integer.parseInt(firstInput[1]);
        int a = Integer.parseInt(firstInput[2]);
        int b = Integer.parseInt(firstInput[3]);
        System.out.println("Enter apples array...");
        String appleString = scanner.nextLine();
        String[] appleArray = appleString.split(",");
        List<Integer> apples = new ArrayList<>();
        for(String str: appleArray) {
            apples.add(Integer.parseInt(str));
        }
        System.out.println("Enter oranges array");
        String orangeString = scanner.nextLine();
        String[] orangeArray = orangeString.split(",");
        List<Integer> oranges = new ArrayList<>();
        for(String str: orangeArray) {
            oranges.add(Integer.parseInt(str));
        }

        countApplesAndOranges(s,t,a,b,apples,oranges);
    }
    public static void countApplesAndOranges (int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        int appleCount = 0;
        int orangeCount = 0;
        for(Integer i: apples) {
            if(a + i >= s && a+i <= t) {
                appleCount++;
            }
        }
        for(Integer i: oranges) {
            if(b + i <= t && b+i >= s) {
                orangeCount++;
            }
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }
}
