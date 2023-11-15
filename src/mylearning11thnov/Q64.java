//64.	Write a Java program to find a missing number in an array. 
package mylearning11thnov;
import java.util.*;
public class Q64 {
	 public static void main(String[] args) {
	        int[] arr = {4, 3, 2, 7, 8, 1, 5};
	        System.out.println("Missing number: " + findMissingNumber(arr));
	    }
	    public static int findMissingNumber(int[] arr) {
	        Arrays.sort(arr);
	        int left = 0;
	        int right = arr.length - 1;
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            if (arr[mid] > mid + 1) {
	            } else {
	                left = mid + 1;
	            }
	        }
	        return left;
	    }
}
