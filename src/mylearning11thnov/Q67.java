//67.	Write a Java program to get the difference between the largest and smallest values in an array of integers. The array must have a length of at least 1. 
package mylearning11thnov;
import java.util.*;
public class Q67 {
	public static void main(String[] args) {
        int[] arr = {4, 3, 0, 7, 8, 1, 0, 5};
        	if (arr.length < 1) {
            System.out.println("Error: Array length must be at least 1.");
            return;
        }
        Arrays.sort(arr);
        int min = arr[0]; 
        int max = arr[arr.length - 1]; 
        int difference = max - min;
        System.out.println("The difference between the largest and smallest values in the array is: " + difference);
    }
}
