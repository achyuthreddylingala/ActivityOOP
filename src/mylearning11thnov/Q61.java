// 61.	Write a Java program to find the second smallest element in an array. 
package mylearning11thnov;
import java.util.*;
public class Q61 {
	public static void main(String[] args) {
        int[] array = {10, 5, 100, 15, 99, 95, 50, 25};
        System.out.println("Original array: " + Arrays.toString(array));
        int secondSmallest = findSecondSmallest(array);
        System.out.println("Second smallest element: " + secondSmallest);
    }
    public static int findSecondSmallest(int[] array) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Invalid array");
        }
        int min = array[0]; 
        int secondMin = Integer.MAX_VALUE; 
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                secondMin = min;
                min = array[i];
            } else if (array[i] < secondMin && array[i] > min) {
            }
        }
        return secondMin;
    }
}
