public class linearSearch {
    public static void main(String[] args) {
        int arr[]={2,6,4,19,10,25};
        int target=190;
        linearSearch(arr,target);
    }
    public static void linearSearch(int arr[],int target){
        boolean found=false;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == target) {
                System.out.println("Element is found at index " + i);
                found = true;
                break;
            }
        }
            if(!found){
                System.out.println("Element not found");
        }

    }
}
