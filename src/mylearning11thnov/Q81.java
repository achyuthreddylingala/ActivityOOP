/*81.	Write a Java program to sort an array of positive integers from an array. In the sorted array the value of the first element should be maximum, the second value should be a minimum, third should be the second maximum, the fourth should be the second minimum and so on.   */
package mylearning11thnov;
import java.util.*;
public class Q81 {
	 public static void main(String[] args) {
	        int[] arr = {12, 13, 5, 6, 15};
	        sortArray(arr);
	        System.out.println(Arrays.toString(arr));
	    }
	    public static void sortArray(int[] arr) {
	        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
	        for (int num : arr) {
	            maxHeap.offer(num);
	        }
	        boolean flag = true;
	        for (int i = 0; i < arr.length; i++) {
	            if (flag) {
	                arr[i] = maxHeap.poll();
	                flag = false;
	            } else {
	                if (!maxHeap.isEmpty()) {
	                    minHeap.offer(maxHeap.poll());
	                }
	                arr[i] = minHeap.poll();
	                flag = true;
	            }
	        }
	    }
}
