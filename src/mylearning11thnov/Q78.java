//78.	Write a Java program to find the rotation count in a given rotated sorted array of integers.   
package mylearning11thnov;
public class Q78 {
	public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Rotation count in the array: " + findRotationCount(arr));
    }
    public static int findRotationCount(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return 0;
        }
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid < n - 1 && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[n - 1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1; 
    }
}
