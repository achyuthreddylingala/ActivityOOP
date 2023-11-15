//51.	Write a Java program to copy an array by iterating the array. 
package mylearning11thnov;
import java.util.*;
public class Q51 {
	 public static void main(String[] args) {
	        int[] originalArray = {1, 2, 3, 4, 5};
	        System.out.println("Original array: " + Arrays.toString(originalArray));
	        int[] copiedArray = copyArray(originalArray);
	        System.out.println("Copied array: " + Arrays.toString(copiedArray));
	    }
	    public static int[] copyArray(int[] originalArray) {
	        int[] newArray = new int[originalArray.length];
	        for (int i = 0; i < originalArray.length; i++) {
	            newArray[i] = originalArray[i];
	        }
	        return newArray;
	    }
}
