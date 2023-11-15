//52.	Write a Java program to insert an element (specific position) into an array. 
package mylearning11thnov;
import java.util.*;
public class Q52 {
	public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] modifiedArray = insertElement(originalArray, 7, 2);
        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("Modified array: " + Arrays.toString(modifiedArray));
    }
    public static int[] insertElement(int[] array, int element, int position) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            if (i < position) {
                newArray[i] = array[i];
            } else if (i >= position) {
            	newArray[i + 1] = array[i];
            }
        }
        newArray[position] = element;
        return newArray;
    }
}
