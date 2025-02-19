package Strings;

public class revString {
    public static void main(String[] args) {
        String str = "mams";
        //StringBuilder res = new StringBuilder();
        char ch[] = str.toCharArray();
        String res=palin(str);
        System.out.println(res);
    }
    public static String palin(String str){
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return "not palindrome";
            }
            start++;
            end--;
        }
        return "palindrome";

    }
}
