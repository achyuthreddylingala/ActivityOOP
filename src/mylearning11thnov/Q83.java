//83.	Write a Java program to separate even and odd numbers from a given array of integers. Put all even numbers first, and then odd numbers.   
package mylearning11thnov;
import java.util.*;
public class Q83 {
	public static void main(String[] args) {
        int[] arr = {3, 2, 4, 6, 1, 8, 9, 7, 5, 10};
        sortBinaryArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortBinaryArray(int[] arr) {
        int left = 0; 
        int right = arr.length - 1; 
        while (left < right) {
            while (arr[left] % 2 == 0 && left < right) {
                left++;
            }
            while (arr[right] % 2 != 0 && left < right) {
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
