package Strings;

import java.util.HashMap;
import java.util.Map;

public class firstNonRepeating {
    public static void main(String[] args) {
        String str = "hhiilohytrrtdv";
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map);
        for (char c : str.toCharArray()) {
            if (map.get(c) == 1) {
                System.out.println("first non-repeating character is:" + c);
                return;
            }
        }
                System.out.println("no non-repeating characters found");
            }
        }
