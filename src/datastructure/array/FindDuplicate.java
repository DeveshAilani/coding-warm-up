package datastructure.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Question 2: Find a duplicate element in a limited range array
 * https://www.techiedelight.com/find-duplicate-element-limited-range-array/
 */
public class FindDuplicate {

    public static int findDuplicateM3(int[] A) {
        // create an visited array of size n+1
        // we can also use map instead of visited array
        boolean[] visited = new boolean[A.length + 1];

        // for each element of the array mark it as visited and
        // return the element if it is seen before
        for (int i = 0; i < A.length; i++) {
            // if element is seen before
            if (visited[A[i]]) {
                return A[i];
            }

            // mark element as visited
            visited[A[i]] = true;
        }

        // no duplicate found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {111, 2, 3, 4, 2, 8, 7, 4, 8};
        FindDuplicate obj = new FindDuplicate();
        //obj.findDuplicateM1(arr);
        //obj.findDuplicateM2(arr);
        System.out.println("Duplicate element is " + findDuplicateM3(arr));

    }

    // Method 1
    private void findDuplicateM1(int[] arr) {
        int total = arr.length;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (arr[i] == arr[j])
                    System.out.println("Duplicate no is: " + arr[i]);
            }
        }
    }

    // Method 2
    private void findDuplicateM2(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (map.containsKey(arr[i])) {
                System.out.println("Dup: " + arr[i]);
            }
            map.put(arr[i], i);
        }
    }
}
