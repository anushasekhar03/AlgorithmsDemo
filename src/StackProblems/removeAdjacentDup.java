package StackProblems;

import java.util.Stack;

public class removeAdjacentDup {

    public static void main(String[] args) {
        String str="fftygggo";
        Stack<Character>st=new Stack();

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(!st.isEmpty() && st.peek() == str.charAt(i)){
                st.pop();
            }
            else{
                st.push(str.charAt(i));
            }
        }
        for(Character ch:st){
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}
