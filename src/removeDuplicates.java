import java.util.HashSet;
import java.util.Set;

public class removeDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 2, 1, 3, 4, 5, 3};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
        System.out.println(set.size());
    }
    }
