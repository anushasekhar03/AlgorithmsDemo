import java.util.Arrays;
import java.util.Scanner;
public class demo {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of string");
            int n=sc.nextInt();
            System.out.println("Enter string");
           String arr[]=new String[n];
           for(int i=0;i<=arr.length;i++){
               arr[i]=sc.nextLine();
           }
            System.out.println("Enter positions of x and y");
           int x=sc.nextInt();
           int y=sc.nextInt();

           if(x>0&&x<n && y>0 && y<n){
               System.out.println(arr[x].length());
               System.out.println(arr[y].length());
           }


        }
    }
