package Strings;

public class staticMethod {
    static int a=9;
    static void repo(){
        System.out.println("static method");
    }
    static{
        int a=8;
        System.out.println("static block");
    }
public static void main(String[] args) {
        System.out.println("main method");
    System.out.println(a);
    repo();

 }
}
