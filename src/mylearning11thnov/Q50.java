//50.Write a Java program to remove a specific element from an array. 
package mylearning11thnov;
import java.util.*;
public class Q50 {
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Target value: " + target);
        array = removeElement(array, target);
        System.out.println("Updated array: " + Arrays.toString(array));
    }
    public static int[] removeElement(int[] original, int target) {
        int[] newArray = new int[original.length - 1];
        boolean found = false;
        for (int i = 0, j = 0; i < original.length; i++) {
            if (original[i] != target || found) {
                newArray[j] = original[i];
                j++;
            } else {
                found = true;
            }
        }
        if (!found) {
            return original;
        }
        return newArray;
    }
}
