//79.	Write a Java program to arrange the elements of an array of integers so that all negative integers appear before all positive integers.   
package mylearning11thnov;
import java.util.*;
public class Q79 {
	public static void main(String[] args) {
        int[] arr = {12, -13, -5, 6, -15};
        separateNegativePositive(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void separateNegativePositive(int[] arr) {
        int n = arr.length;
        int[] negative = new int[n];
        int[] positive = new int[n];
        int negCount = 0; 
        int posCount = 0; 
        for (int num : arr) {
            if (num < 0) {
                negative[negCount++] = num;
            } else {
                positive[posCount++] = num;
            }
        }
        for (int i = 0; i < negCount; i++) {
            arr[i] = negative[i];
        }
        for (int i = 0; i < posCount; i++) {
            arr[negCount + i] = positive[i];
        }
    }
}
