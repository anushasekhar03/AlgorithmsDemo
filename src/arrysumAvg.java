import java.util.Arrays;
import java.util.Scanner;

public class arrysumAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int sum=0;
        int avg=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("sum"+sum);
        avg=(sum/arr.length-1);
        System.out.println("avg"+avg);

    }
}
