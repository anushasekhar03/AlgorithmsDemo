import java.util.ArrayList; // For dynamic storage of leaders
import java.util.List;

public class leadersArray {
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2}; // Input array

        // List to store leaders
        List<Integer> leaders = new ArrayList<>();

        // Initialize the last element as the leader
        int maxFromRight = arr[arr.length - 1];
        leaders.add(maxFromRight); // Add the last element to leaders list

        // Traverse the array from right to left
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i]; // Update max
                leaders.add(maxFromRight); // Add to leaders list
            }
        }
        // Since leaders are added in reverse order, reverse the list to maintain correct order
        System.out.print("Leaders in the array are: ");
        for (int i = leaders.size() - 1; i >= 0; i--) {
            System.out.print(leaders.get(i) + " ");
        }
    }
}
