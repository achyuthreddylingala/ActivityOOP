/*72.	Write a Java program to remove duplicate elements from a given array and return the updated array length.
Sample array: [20, 20, 30, 40, 50, 50, 50]
After removing the duplicate elements the program should return 4 as the new length of the array.  
*/
package mylearning11thnov;
import java.util.*;
public class Q72 {
	public static void main(String[] args) {
        int[] arr = {20, 20, 30, 40, 50, 50, 50};
        int newLength = removeDuplicates(arr);
        System.out.println("New length of the array: " + newLength);
    }
    public static int removeDuplicates(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int newLength = 0;
        for (int num : arr) {
            if (!set.contains(num)) {
                set.add(num);
                newLength++;
            }
        }
        return newLength;
    }
}
