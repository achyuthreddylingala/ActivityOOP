//66.	Write a Java program to find the number of even and odd integers in a given array of integers. 
package mylearning11thnov;
public class Q66 {
	public static void main(String[] args) {
        int[] arr = {4, 3, 0, 7, 8, 1, 0, 5};
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            switch (num % 2) {
                case 0:
                    evenCount++; 
                    break;
                case 1:
                    oddCount++; 
                    break;
            }
        }
        System.out.println("Number of even integers: " + evenCount);
        System.out.println("Number of odd integers: " + oddCount);
    }
}
