package Strings;

public class removeSpace {
    public static void main(String[] args) {
        String s = "anushasan hi delhi";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isWhitespace(ch)) {
                sb.append(ch);
            }
        }
        System.out.println("Without spaces: " + sb.toString());
    }
}
