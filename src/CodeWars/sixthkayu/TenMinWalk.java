package CodeWars.sixthkayu;

import Easy.IntegerProblems.IsNumberPalindrome.main;

public class TenMinWalk {
    public static void main(String[] args) {

        System.out.println(isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
    }
    public static boolean isValid (char[] walk) {
        if(walk.length != 10) return  false;
        else {
            int up = 0;
            int down = 0;
            int left = 0;
            int right = 0;

            for(int i = 0; i<10; i++) {
                if(walk[i] == 'n') up++;
                if(walk[i] == 's') down--;
                if(walk[i] == 'e') right++;
                if(walk[i] == 'w') left--;
            }
            return (up+down==0 && left+right==0);
        }
    }
}
