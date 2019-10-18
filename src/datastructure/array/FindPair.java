package datastructure.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Question 1 : Find Pair with given Sum in the Array
 * https://www.techiedelight.com/find-pair-with-given-sum-array/
 */
public class FindPair {

    public static void main(String[] args) {
        int[] arr = {8, 7, 3, 2, 3, 1, 9};
        int sum = 10;

        FindPair obj = new FindPair();
        //obj.findPairM2(arr, sum);
        obj.findPairM3(arr, sum);
    }

    // Method 1 is very bakwas :)
    // Method 2
    private void findPairM2(int[] arr, int sum) {
        Arrays.sort(arr);

        int min = 0;
        int max = arr.length - 1;

        while (min < max) {
            if (arr[min] + arr[max] == sum) {
                System.out.println("Pair found {" + arr[min] + "," + arr[max] + "}...");
            }

            if (arr[min] + arr[max] < sum) {
                min++;
            } else {
                max--;
            }
        }
    }

    // Method 3
    private void findPairM3(int[] arr, int sum) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= arr.length - 1; i++) {
            int diff = sum - arr[i];
            if (map.containsKey(diff)) {
                System.out.println("Pair found {" + arr[i] + ", " + diff + "}");
            }

            map.put(arr[i], i);
        }
    }
}