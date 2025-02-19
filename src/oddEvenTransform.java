import java.util.Arrays;

public class oddEvenTransform {
    public static void main(String[] args) {
        int arr[] = {3, 4, 9};
        int n = 3;
        int[] transformedArray = transform(arr, n);
        System.out.println(Arrays.toString(transformedArray));
    }

    public static int[] transform(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % 2 == 0) {
                    arr[j] -= 3;
                } else {
                    arr[j] += 3;
                }
            }
        }
        return arr;
    }
}
