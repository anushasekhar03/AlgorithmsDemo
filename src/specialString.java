public class specialString {
    public static void main(String[] args) {
        String s = "aaaa";
        boolean isSpecial = true;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                isSpecial = false;
                break;
            }
        }
        if (isSpecial) {
            System.out.println("String is a special string");
        } else {
            System.out.println("String is not a sprcial string");
        }
    }


}