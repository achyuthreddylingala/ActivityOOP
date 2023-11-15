//70.	Write a Java program to check if the sum of all the 10's in the array is exactly 30. Return false if the condition does not satisfy, otherwise true. 
package mylearning11thnov;
public class Q70 {
	public static void main(String[] args) {
        int[] arr = {4, 3, 10, 7, 8, 10, 1, 0, 5};
        System.out.println(checkSum(arr));
    }
    public static boolean checkSum(int[] arr) {
        int sum = 0; 
        for (int num : arr) {
            if (num % 10 == 0) {
                sum += num; 
            }
        }
        return sum == 30;
    }
}
