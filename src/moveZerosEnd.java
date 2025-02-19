import java.util.Arrays;

public class moveZerosEnd {
    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 3, 0, 0, 7, 6, 4, 0};
        int n = arr.length;

        // Pointer to track the position to place non-zero elements
        int index = 0;

        // Traverse the array and move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill the rest of the array with zeros
        while (index < n) {
            arr[index] = 0;
            index++;
        }

        // Print the modified array
        System.out.println(Arrays.toString(arr));
    }
}
