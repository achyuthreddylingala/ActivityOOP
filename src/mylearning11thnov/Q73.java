/*73.	Write a Java program to find the length of the longest consecutive elements sequence from an unsorted array of integers.
Sample array: [49, 1, 3, 200, 2, 4, 70, 5] 
The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the program will return its length 5.  
*/
package mylearning11thnov;
import java.util.*;
public class Q73 {
	public static void main(String[] args) {
        int[] arr = {49, 1, 3, 200, 2, 4, 70, 5};
        System.out.println("Length of the longest consecutive elements sequence: " + longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxLength = 0; 
        for (int num : nums) {
            set.add(num);
        }
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1; 
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentLength += 1;
                }                
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        return maxLength;        
    }    
}
