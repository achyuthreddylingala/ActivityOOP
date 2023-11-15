//77.	Write a Java program to cyclically rotate a given array clockwise by one.   
package mylearning11thnov;
import java.util.*;
public class Q77 {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotateArrayClockwise(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void rotateArrayClockwise(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return;
        }
        int last = arr[n - 1]; // Store the last element of the array
        System.arraycopy(arr, 0, arr, 1, n - 1);
        arr[0] = last; 
    }
}
