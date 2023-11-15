//47.	Write a Java program to calculate the average value of array elements. 
package mylearning11thnov;
import java.util.*;
public class Q47 {
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Average value: " + calculateAverage(array));
    }
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
        sum += num;
        }
        return (double) sum / array.length;
    }
}
