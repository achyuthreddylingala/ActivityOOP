//65.	Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements. 
package mylearning11thnov;
import java.util.*;
public class Q65 {
	public static void main(String[] args) {
        int[] arr = {4, 3, 0, 7, 8, 1, 0, 5};
        System.out.println("Array before moving 0's to the end: " + Arrays.toString(arr));
        moveZeroesToEnd(arr);
        System.out.println("Array after moving 0's to the end: " + Arrays.toString(arr));
    }
    public static void moveZeroesToEnd(int[] arr) {
        int left = 0; // Initialize the left pointer
        int right = arr.length - 1; // Initialize the right pointer
        while (left <= right) {
            if (arr[left] == 0) {
                int temp = arr[left];
                for (int i = left; i < right; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[right] = temp;
                right--;
            } else {
                left++;
            }
        }
    }
}
