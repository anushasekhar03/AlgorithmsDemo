package Strings;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=fiboncci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + res);

    }
    public static int fiboncci(int n){
        if(n<=1){
            return n;
        }
        int previous=1;
        int current=1;
        for(int i=2;i<n;i++){
            int next=previous+current;
            previous=current;
            current=next;
        }
        return current;
    }
}
