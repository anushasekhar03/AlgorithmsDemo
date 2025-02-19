package Strings;

public class revEachWordsofString {
    public static void main(String[] args) {
        String str = "she loves java";
        String res = reverseEachWord(str);
        System.out.println(res);
    }

    public static String reverseEachWord(String str) {
        StringBuilder result = new StringBuilder();
        int start = 0;

        // Loop through the string
        for (int i = 0; i <= str.length(); i++) {
            // Check if we reached the end of a word (or end of string)
            if (i == str.length() || str.charAt(i) == ' ') {
                // Reverse the word from 'start' to 'i-1'
                for (int j = i - 1; j >= start; j--) {
                    result.append(str.charAt(j));
                }
                 //Add space after each word, except for the last one
                if (i != str.length()) {
                    result.append(' ');
                }
                // Update the start of the next word
                start = i + 1;
            }
        }

        return result.toString();
    }
}
