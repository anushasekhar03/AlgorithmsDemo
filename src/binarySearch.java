public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int target = 20;
        int res = binarySearch(arr, target);
        System.out.println(res);
    }

    public static int binarySearch(int arr[], int target) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            // Corrected comparison logic
            if (arr[mid] == target) {
                return mid; // Return the index of the target
            } else if (arr[mid] < target) {
                l = mid + 1; // Move the left pointer to mid + 1
            } else {
                r = mid - 1; // Move the right pointer to mid - 1
            }
        }
        return -1; // Target not found
    }
}
