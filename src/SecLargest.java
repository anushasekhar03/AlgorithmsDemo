public class SecLargest {
    public static void main(String[] args) {
        int arr[]={4,5,3,6,7};
        int n=arr.length;
        int secMax=Secondmaximum(n,arr);
        System.out.println(secMax);
    }

    private static int Secondmaximum(int n, int[] arr) {
        int Max=arr[0];
        int Smax=-1;

        for(int i=0;i<n;i++){
            if(arr[i]>Max){
                Smax=Max;
                Max=arr[i];
            }
        else if(arr[i]<Max && arr[i]>Smax){
            Smax=arr[i];
            }
        }
        return Smax;
    }
}
