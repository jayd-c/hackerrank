package CodeWars;

import javax.swing.plaf.synth.SynthToolTipUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ANeedleInTheHayStack {
    public static void main(String[] args) {
        Object[] oArr  = new Object[] {1,null,"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk",null};
        System.out.println(findNeedle(oArr));
        Object i  = 2.3356;
        System.out.println(i.toString());

    }
    public static String findNeedle(Object[] haystack) {
        List<Object> list = new ArrayList<>(Arrays.asList(haystack));
        System.out.println(list);

        for(int i = 0; i< list.size(); i++) {

            if(list.get(i) != null){
                System.out.println(list.get(i).toString().trim());
                if(list.get(i).toString().trim().equals("needle") && list.get(i) != null){
                    System.out.println(list.get(i).toString().trim());
                    return "found needle at position " + i;
                }
            }
        }
        return null;

    }
}
