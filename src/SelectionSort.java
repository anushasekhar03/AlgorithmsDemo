public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={9,5,1,4,3};
        selectionSort(arr);
        for(int n:arr){
            System.out.print(n+ " ");
        }

    }
    public static void selectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }

    }
}
