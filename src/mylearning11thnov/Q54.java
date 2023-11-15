//54.	Write a Java program to reverse an array of integer values. 
package mylearning11thnov;
import java.util.*;
public class Q54 {
	 public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5};
	        System.out.println("Original array: " + Arrays.toString(array));
	        int[] reversedArray = reverseArray(array);
	        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
	    }
	    public static int[] reverseArray(int[] array) {
	        int start = 0;
	        int end = array.length - 1;
	        while (start < end) {
	            int temp = array[start];
	            array[start] = array[end];
	            array[end] = temp;
	            start++;
	            end--;
	        }
	        return array;
	    }
}
