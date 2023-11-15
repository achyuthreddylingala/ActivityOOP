//71.	Write a Java program to check if an array of integers contains two specified elements 65 and 77.
package mylearning11thnov;
public class Q71 {
	public static void main(String[] args) {
        int[] arr = {4, 3, 65, 7, 8, 65, 1, 0, 5};
        System.out.println(checkElements(arr, 65, 77));
    }
    public static boolean checkElements(int[] arr, int x, int y) {
        int count = 0; 
        for (int num : arr) {
            if (num == x || num == y) {
                count++; 
            }
        }
        return count == 2;
    }	
}
