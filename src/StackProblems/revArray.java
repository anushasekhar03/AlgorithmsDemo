package StackProblems;

import java.util.Arrays;
import java.util.Stack;

public class revArray {
    public static void main(String[] args) {
        int arr[]={3,5,6,7,8,0,7,0};
    reverseArray(arr);
    for(int num:arr){
        System.out.print(num+ ", ");
    }
        System.out.print(Arrays.toString(arr));

    }
    public static void reverseArray(int[] arr){
        Stack<Integer> st=new Stack();
        for(int i=0;i<arr.length;i++){
            st.push(arr[i]);
        }
        int k=0;
        while(!st.isEmpty()){
            arr[k]=st.pop();
            k++;
        }}
}
