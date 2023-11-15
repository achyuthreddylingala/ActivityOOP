//43.	Create a program to calculate the square of a number using a do-while loop.
package mylearning11thnov;
import java.util.Scanner;
public class Q43 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int num;
	        int square = 0;
	        do {
	            System.out.println("Enter a number:");
	            num = scanner.nextInt();
	            if (num < 0) {
	                System.out.println("Invalid input! Please enter a non-negative number.");
	            }
	        } while (num < 0);

	        int temp = num;
	        do {
	            square += temp;
	            temp--;
	        } while (temp > 0);

	        System.out.println(num + " squared is " + square);
	    scanner.close();
	    }
}
