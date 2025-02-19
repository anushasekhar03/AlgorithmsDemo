package StackProblems;

import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        int max=-1;
        int arr[]={4,2,6,8,1};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    max=arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + "->" + max);
        }
    }

}
