package Strings;

import java.util.*;

public class ValidTriangle {
    public static List<String> triangleType(List<String> triangleToy) {
        List<String> ans = new ArrayList<>();

        for (String sides : triangleToy) {
            String[] parts = sides.split(" ");
            int side1 = Integer.parseInt(parts[0]);
            int side2 = Integer.parseInt(parts[1]);
            int side3 = Integer.parseInt(parts[2]);

            // Check if it forms a valid triangle
            if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2)) {
                if (side1 == side2 && side2 == side3) {
                    ans.add("Equilateral");
                } else if (side1 == side2 || side2 == side3 || side3 == side1) {
                    ans.add("Isosceles");
                } else {
                    ans.add("Scalene"); // Fixed this part
                }
            } else {
                ans.add("None of these");
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<String> triangleToy = Arrays.asList("1 2 2", "3 3 3", "3 4 5", "1 1 3");
        List<String> result = triangleType(triangleToy);

        for (String res : result) {
            System.out.println(res);
        }
    }
}
