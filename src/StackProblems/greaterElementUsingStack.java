package StackProblems;

import java.util.Stack;

public class greaterElementUsingStack {
    public static void main(String[] args) {
        int arr[]={4,2,6,8,1};
        Stack<Integer>st=new Stack();
        for(int i=0;i<arr.length;i++) {
            if (st.isEmpty()) {
                st.push(arr[i]);
            }
            else{
                if(arr[i]>st.peek() && !st.isEmpty()){
                    System.out.println("Next greater element of " + st.peek() + " -> " + arr[i]);
                    st.pop();
                }
                st.push(arr[i]);
            }

        }
        while(!st.isEmpty()){
            System.out.println("next greatet element of " + st.peek() + " -> " + null);
            st.pop();
        }
    }
}
