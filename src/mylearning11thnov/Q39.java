//39.	Write a program to find the factorial of a number using a do-while loop.
package mylearning11thnov;
import java.util.Scanner;
public class Q39 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Please enter a positive integer:");
	        int num = scanner.nextInt();
	        scanner.close();
	        if (num <= 0) {
	            System.out.println("Sorry, the number should be a positive integer.");
	        } else {
	            long factorial = 1;
	            int i = 1;
	            System.out.println("Calculating the factorial of " + num + "...");
	            do {
	                factorial *= i;
	                System.out.println("Step " + i + ": " + num + " x " + (i - 1) + "! = " + factorial);
	                i++;
	            } while (i <= num);
	            System.out.println("The factorial of " + num + " is " + factorial + ".");
	        }
	    }
}
