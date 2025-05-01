package Strings;

public class removeCharacter {
    public static void main(String[] args) {
        String s = "playbod";
        StringBuilder sb=new StringBuilder(s);
        sb.deleteCharAt(3);
        System.out.println(sb.toString());
    }

}
