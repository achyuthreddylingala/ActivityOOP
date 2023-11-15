//69.	Write a Java program to check if an array of integers is without 0 and -1. 
package mylearning11thnov;
public class Q69 {
	public static void main(String[] args) {
        int[] arr = {4, 3, 0, 7, 8, 1, 0, 5};
        if (isWithoutZeroAndMinusOne(arr)) {
            System.out.println("The array is without 0 and -1.");
        } else {
            System.out.println("The array is not without 0 and -1.");
        }
    }
    public static boolean isWithoutZeroAndMinusOne(int[] arr) {
        for (int num : arr) {
            if (num == 0 || num == -1) {
                return false;
            }
        }
        return true;
    }
}
