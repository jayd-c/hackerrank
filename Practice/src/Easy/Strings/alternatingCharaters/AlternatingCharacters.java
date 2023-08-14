package Easy.Strings.alternatingCharaters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlternatingCharacters {

    public static int minDeletion (String s) {
        List<String> sList = new ArrayList<>(Arrays.asList( s.split("")));
        int count = 0;
        for(int i = 0; i<sList.size()-1; i++) {
            if(sList.get(i).equals(sList.get(i+1))) {
//                sList.remove(sList.get(i+1));
                count++;
            }
        }
//        return s.length() - sList.size()+1;
        return count;
    }
}
