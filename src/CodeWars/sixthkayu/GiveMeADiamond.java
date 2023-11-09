package CodeWars.sixthkayu;

import static java.lang.String.join;
import static java.util.Collections.nCopies;
public class GiveMeADiamond {
    /*
    Jamie is a programmer, and James' girlfriend. She likes diamonds, and wants a diamond string from James.
    Since James doesn't know how to make this happen, he needs your help.

Task
You need to return a string that looks like a diamond shape when printed on the screen, using asterisk (*) characters.
Trailing spaces should be removed, and every line must be terminated with a newline character (\n).

Return null/nil/None/... if the input is an even number or negative, as it is not possible to print a diamond of even or negative size.
     */

    public static void main(String[] args) {

        System.out.println(print(5));

    }

    private static String print(int number) {

        StringBuilder result = new StringBuilder();
        int space = number/2;
        int star = 1;
        for(int i = 0; i<number; i++) {
            result.append(join("",nCopies(space," ")));
            result.append(join("",nCopies(star,"*")));
            result.append("\n");
            if(i<number/2) {
                space--;
                star+=2;
            }else {
                space++;
                star-=2;
            }
        }

        return result.toString();
    }
}


