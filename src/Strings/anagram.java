package Strings;

import java.util.HashMap;
import java.util.Map;

public class anagram {
    public static void main(String[] args) {
        String s1 = "vileug";
        String s2 = "evil";
        Boolean res = isAnagram(s1, s2);
        System.out.println(res);
    }

    private static Boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        String str = s1.concat(s2);
        Map<Character, Integer> m = new HashMap();
        for (char ch : str.toCharArray()) {
            m.put(ch, m.getOrDefault(ch, 0) + 1);
            if (m.get(ch) == 2) {
                return true;
            }
        }
        return false;
    }
}