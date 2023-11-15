//82.	Write a Java program that separates 0s on the left hand side and 1s on the right hand side from a random array of 0s and 1.   
package mylearning11thnov;
import java.util.*;
public class Q82 {
	 public static void main(String[] args) {
	        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 0, 1};
	        sortBinaryArray(arr);
	        System.out.println(Arrays.toString(arr));
	    }
	    public static void sortBinaryArray(int[] arr) {
	        int left = 0; 
	        int right = arr.length - 1; 
	        while (left < right) {
	            while (arr[left] == 0 && left < right) {
	                left++;
	            }
	            while (arr[right] == 1 && left < right) {
	                right--;
	            }
	            if (left < right) {
	                int temp = arr[left];
	                arr[left] = arr[right];
	                arr[right] = temp;
	            }
	        }
	    }
}
