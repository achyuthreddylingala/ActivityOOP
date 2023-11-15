//59.	Write a Java program to remove duplicate elements from an array. 
package mylearning11thnov;
import java.util.*;
public class Q59 {
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 5, 6, 3, 7, 8, 6, 9, 10, 10};
        System.out.println("Original array: " + Arrays.toString(array));
        int[] uniqueArray = removeDuplicates(array);
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }
    public static int[] removeDuplicates(int[] array) {
        if (array == null || array.length == 0) {
            return array; 
        }
        int[] uniqueArray = new int[array.length]; 
        int uniqueCount = 0; 
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (!contains(uniqueArray, num, uniqueCount)) { 
                }
        }
        return Arrays.copyOf(uniqueArray, uniqueCount); 
        }
    public static boolean contains(int[] array, int num, int uniqueCount) {
        for (int i = 0; i < uniqueCount; i++) {
            if (array[i] == num) {
                return true; 
            }
        }
        return false; 
    }
}
