package CodeWars.sixthkayu;

public class FindUniqueNumber {
    public static void main(String[] args) {
        double[] doubles = {1,1,1,1,0.54,1,1,1,};

        System.out.println(findUniqueNumber(doubles));
        
    }
    public static double findUniqueNumber (double[] doubles) {
        for(int  i  = 0; i<doubles.length; i++) {
            for (int j = 0; j<doubles.length; j++) {
                if(doubles[i] != doubles[j]) {
                    return doubles[j];
                }
            }
        }
        return -1;
    }
}
