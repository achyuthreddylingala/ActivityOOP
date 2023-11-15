/*76.	Write a Java program to count the number of possible triangles from a given unsorted array of positive integers.   
Note: The triangle inequality states that the sum of the lengths of any two sides of a triangle must be greater than or equal to the length of the third side.
*/
package mylearning11thnov;
import java.util.*;
public class Q76 {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Number of possible triangles: " + countTriangles(arr));
    }
    public static int countTriangles(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            return 0;
        }
        Arrays.sort(arr);
        int count = 0; 
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] > arr[k]) {
                        count++; 
                    }
                }
            }
        }
        return count;
    }
}
