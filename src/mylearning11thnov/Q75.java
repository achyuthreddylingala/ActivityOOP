/*75.	Write a Java program to find all combinations of four elements of an array whose sum is equal to a given value.   */
package mylearning11thnov;
import java.util.*;
public class Q75 {
	public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int target = 12;
        findCombinations(arr, target);
    }
    public static void findCombinations(int[] nums, int target) {
        int n = nums.length;
        if (n < 4) {
            System.out.println("Not enough elements in the array to form combinations.");
            return;
        }
        Arrays.sort(nums);
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int sum1 = nums[i] + nums[j];
                for (int k = j + 1; k < n - 1; k++) {
                    int sum2 = sum1 + nums[k];
                    for (int l = k + 1; l < n; l++) {
                        int sum = sum2 + nums[l];
                        if (sum == target) {
                            System.out.println("Combination: [" + nums[i] + ", " + nums[j] + ", " + nums[k] + ", " + nums[l] + "]");
                        }
                    }
                }
            }
        }
    }    
}
