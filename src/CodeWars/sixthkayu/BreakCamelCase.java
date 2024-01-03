package CodeWars.sixthkayu;

public class BreakCamelCase {
    public static void main(String[] args) {

        System.out.println(camelCase("camelCase"));
    }
    public static String camelCase (String input) {
        StringBuilder sb;
        if (input.isEmpty()) return input;
        else {
            sb = new StringBuilder();
            for (Character c : input.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    sb.append(" ").append(c);
                } else {
                    sb.append(c);
                }

            }
        }
        return sb.toString();
    }
}
