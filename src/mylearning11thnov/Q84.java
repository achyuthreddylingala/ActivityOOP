/*84.	Write a Java program to replace every element with the next greatest element (from the right side) in a given array of integers. 
There is no element next to the last element, therefore replace it with -1.  
*/
package mylearning11thnov;
import java.util.*;
public class Q84 {
	public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
    public static int[] replaceElements(int[] arr) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        int max = arr[arr.length - 1]; 
        arr[arr.length - 1] = -1; 
        for (int i = arr.length - 2; i >= 0; i--) {
            int temp = arr[i]; 
            arr[i] = max; 
            max = Math.max(max, temp); 
        }
        return arr; 
    }
}
