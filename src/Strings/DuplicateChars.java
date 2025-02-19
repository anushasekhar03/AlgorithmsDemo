package Strings;

import java.util.*;

public class DuplicateChars {
    public static void main(String[] args) {
        String str = "Learn Java Programming";
        char ch[] = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (char c : ch) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        Set<Character>set=map.keySet();
        for(char h:set)
            if (map.get(h) > 1) {
                System.out.println(h + " " + map.get(h));
            }
        }
    }