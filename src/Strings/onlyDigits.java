package Strings;

public class onlyDigits {
    public static void main(String[] args) {
        String s="12345sed";
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                System.out.println("digits");
            }
            else{
                System.out.println("not digits");
            }
        }
    }
}
