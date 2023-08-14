package Easy.Strings.beautifulBinaryString;

public class BeautifulBinary {
    public static void main(String[] args) {
        System.out.println(beautifulBinary("0101010"));
    }
    public static int beautifulBinary (String s) {
        int count = 0;
        String[] sArr = s.split("");
        for(int i = 1; i< sArr.length; i++) {
            if(sArr[i-1].equals("0") && sArr[i].equals("1") && sArr[i+1].equals("0")) {
                sArr[i+1] = "1";
                count++;
            }
        }
        return count;
    }
}
