package Easy.Strings.reverseString;

public class Main {
    public static void main(String[] args) {
        System.out.println(myReverseString("hello"));
        System.out.println(myReverseCharArray(new char[] {'h','e','l','l','o'}));
        reverseString(new char[] {'h','e','l','l','o'});
    }

    public static void reverseString (char[] s) {
        int left = 0;
        int right = s.length-1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;

        }
        System.out.println(s);
    }

    //first see if the parameter is a String but actually it is a char[];
    public static String myReverseString (String str) {
        char[] charStr = str.toCharArray();
        StringBuilder newStr = new StringBuilder();
        for(int i = charStr.length-1; i>=0; i--) {
            newStr.append(charStr[i]);
        }
        return newStr.toString();
    }
    public static String myReverseCharArray (char[] s) {
        StringBuilder str = new StringBuilder();
        for(int i = s.length-1; i>=0; i--) {
            str.append(s[i]);
        }
        return str.toString();
    }

}


