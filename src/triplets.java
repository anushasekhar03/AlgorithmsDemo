import java.util.ArrayList;
import java.util.List;

public class triplets {
    public static void main(String[] args) {
        int arr[] = {3, 3, 4, 7, 8};
        int d = 5;
        List<List<Integer>> triplets = triple(arr, d);
        System.out.println("Count of triplets: " + triplets.size());
        System.out.println("Triplets: " + triplets);
    }

    public static List<List<Integer>> triple(int[] arr, int d) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {  // Fixed loop condition
                    if ((arr[i] + arr[j] + arr[k]) % d == 0) {
                        list.add(List.of(arr[i], arr[j], arr[k]));
                    }
                }
            }
        }
        return list;
    }
}
