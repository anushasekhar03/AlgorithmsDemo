package Strings;

import java.util.HashSet;
import java.util.Set;

public class doubleChar {
    public static void main(String[] args) {
        String str = "helloiea";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            sb.append(ch).append(ch);
        }
        System.out.println(sb);
    }
}
