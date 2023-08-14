package Easy.Lists;

public class PlusMinus {
    public static void main(String[] args) {
        double d = 2.0/5.0;
//        System.out.printf("%7.6f",d);

        for(int i = 0; i<5; i++) {
            for(int j = 0 ; j<5-i-1; j++) {
                System.out.print("#");
            }
            for(int j = 0; j<i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
