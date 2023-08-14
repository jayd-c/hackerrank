package Easy.Strings.SuperReducedString;

public class SuperReducedString {

    public static void main(String[] args) {
        System.out.println(getRidAdjacent("aaabccddd"));
    }

    public static String superReduce (String s) {
        return "";
    }

    public static String getRidAdjacent (String s) {
        String result = "";
        String[] strArr = s.split("");
        for (int i = 0; i<strArr.length-1; i++) {
            if(strArr[i].equals(strArr[i+1])) {
                result = s.substring(i+2);

            }
        }
        return result;
    }



}
