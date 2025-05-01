package Strings;

public class repeatingword {
    public static void main(String[] args) {
        String s="anusha what are you doing";
   wordduplicate(s);

    }
    public static void wordduplicate(String s){
        int st=0;
        int end=s.length()-1;
        for(int i=0;i<s.length();i++){
            int count=0;
           if(s.charAt(st)==s.charAt(end)){
               count++;
           }
           if(count>1){
               System.out.println(s.charAt(i));
           }
        }
    }
}
