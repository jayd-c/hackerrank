package CodeWars.sixthkayu;

public class WhoLikesThis {
    public static void main(String[] args) {
        System.out.println(whoLikes("Alex", "Jacob", "peter", "llfdas","matts"));
    }
    public static String whoLikes (String... names) {

        if(names.length == 0) return "no one likes this";
        if(names.length == 1) return names[0] + " likes this";
        if(names.length == 2) return names[0] + " and " + names[1] + " like this";
        if(names.length == 3) return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        else
            return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
    }
}