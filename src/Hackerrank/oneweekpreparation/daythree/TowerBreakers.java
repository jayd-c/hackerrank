package Hackerrank.oneweekpreparation.daythree;

public class TowerBreakers {

    public static void main(String[] args) {

        System.out.println(towerBreakers(1,4));

    }
    public static int towerBreakers (int n, int m) {

        if(n % 2 == 0 || m == 1) return 2;
        else return 1;

    }
}
