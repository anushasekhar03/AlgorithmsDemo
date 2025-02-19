package Strings;

public class noOfWords {
    public static void main(String[] args) {
        String str="hi my name is anusha";
        char ch[]=str.toCharArray();
        int count=1;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
