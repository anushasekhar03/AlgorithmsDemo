public class ProductOfThree {
    public static void main(String[] args) {
        int arr[] = {-1,-2,-3};
        int res=productofThree(arr);
        System.out.println(res);
    }
    public static int productofThree(int arr[]) {
        int n = arr.length-1;
        int max=1;
       // int mul=(arr[n] * arr[n-1] * arr[n-2]);
        for(int i=n;i>=n-2;i--) {
            max = max * arr[i];
        }
        return max;
    }
}