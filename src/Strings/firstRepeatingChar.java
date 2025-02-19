package Strings;

import java.util.HashMap;
import java.util.Map;

public class firstRepeatingChar {
    public static void main(String[] args) {
        String str = "jajolwruwavaclinic";
        char result = firstRepeatingChar(str);
        if (result != '\0') {
            System.out.println("First repeating character: " + result);
        } else {
            System.out.println("No repeating character found.");
        }
    }

    public static char firstRepeatingChar(String str) {
        Map<Character, Integer> charCount = new HashMap<>();

        // Step 1: Count occurrences of each character
        for (char ch : str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find the first character with count > 1
        for (char ch : str.toCharArray()) {
            if (charCount.get(ch) > 1) {
                return ch; // First repeating character found
            }
        }

        return '\0'; // No repeating character found
    }
}
