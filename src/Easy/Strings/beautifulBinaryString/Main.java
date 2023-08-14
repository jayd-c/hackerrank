package Easy.Strings.beautifulBinaryString;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println(mySolution("0100101010100010110100100110110100011100111110101001011001110111110000101011011111011001111100011101"));

        System.out.println(beautifulBinaryString("0101010"));
        System.out.println(BeautifulBinary.beautifulBinary("0101010"));
    }
    private static int beautifulBinaryString (String  b) {
        int count = 0;
        char[] chars = b.toCharArray();
        for(int i = 1;i<chars.length-1; i++) {
            if( chars[i-1] == '0' && chars[i] == '1' && chars[i+1]=='0') {
                chars[i+1] = '1';
                count++;
            }
        }
        return count;
    }
    private static int mySolution (String b) {
        int count = 0;
        List<String> list = new ArrayList<>();
        for(int i = 0; i<b.length(); i++) {
           list.add(b.substring(i));

            }
        System.out.println(list);
        return 0;
        }

}
