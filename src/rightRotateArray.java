import java.util.Arrays;

public class rightRotateArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;

        // Store the last element
        int temp = arr[n - 1];

        // Shift elements to the right
        for (int i = n - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }

        // Place the last element at the front
        arr[0] = temp;

        // Print the rotated array
        System.out.println(Arrays.toString(arr));
    }
}
