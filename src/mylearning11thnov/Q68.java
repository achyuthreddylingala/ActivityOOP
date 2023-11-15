//68.	Write a Java program to compute the average value of an array of integers except the largest and smallest values. 
package mylearning11thnov;
import java.util.*;
public class Q68 {
	public static void main(String[] args) {
        int[] arr = {4, 3, 0, 7, 8, 1, 0, 5};
        if (arr.length < 3) {
            System.out.println("Error: Array length must be at least 3.");
            return;
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            sum += arr[i];
        }
        double average = (double) sum / (arr.length - 2);
        System.out.println("The average value of the array, except the largest and smallest values, is: " + average);
    }
}
