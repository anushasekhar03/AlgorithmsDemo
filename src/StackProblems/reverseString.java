package StackProblems;

import java.util.Stack;

public class reverseString {

    public static void main(String[] args) {
        String str=" lokesh";
        String res= String.valueOf(revString(str));
        System.out.println(res);
    }
    public static String revString(String str){
        Stack<Character>st=new Stack<>();
        char ch[]=str.toCharArray();
        if(str==null || str.equals("")){
            return str;
        }
        for(int i=0;i<str.length();i++)
        {
            st.push(ch[i]);
        }
        int index=0;
        while(!st.isEmpty()) {
            ch[index] = st.pop();
            index++;
        }
        return new String(ch);
    }
}
