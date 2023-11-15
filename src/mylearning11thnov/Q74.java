/*74.	Write a Java program to find the sum of the two elements of a given array equal to a given integer.
Sample array: [1,2,4,5,6] 
Target value: 6. 
*/
package mylearning11thnov;
import java.util.*;
public class Q74 {
	public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int target = 6;
        int[] result = findSumPair(arr, target);
        if (result.length > 0) {
            System.out.println("The two elements that sum to the target value are: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two elements sum to the target value.");
        }
    }
    public static int[] findSumPair(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i]; 
            if (map.containsKey(complement)) {
                return new int[]{complement, arr[i]};
            }
            map.put(arr[i], i); 
        }
        return new int[]{};
    }
}
