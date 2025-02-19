package Strings;

public class palindrome {
    public static void main(String[] args) {
        String str = "madam";
        boolean res=palin(str);
        System.out.println(res);
    }

    public static boolean palin(String str) {
        int start = 0;
        int end = str.length() - 1;
        for (int i = 0; i < end + 1; i++) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}