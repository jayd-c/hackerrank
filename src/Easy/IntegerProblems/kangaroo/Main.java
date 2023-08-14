package Easy.IntegerProblems.kangaroo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1,v1,x2,v2......");
        String data = scanner.nextLine();
        String[] dataArr = data.split(",");
        int x1 = Integer.parseInt(dataArr[0]);
        int x2 = Integer.parseInt(dataArr[1]);
        int v1 = Integer.parseInt(dataArr[2]);
        int v2 = Integer.parseInt(dataArr[3]);

        System.out.println(kangaroo(x1,x2,v1,v2));

    }
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        int count = 0;
        while (x1 != x2 && (count < x1+x2+v1+v2)) {
            count++;
            x1 += v1;
            x2 += v2;
        }
            if(x1 == x2) {
                return "YES";
            } else {
                return "NO";
            }
    }

}


