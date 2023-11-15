//34.	Create a program to print the multiplication table of a number using a while loop.
package mylearning11thnov;
import java.util.Scanner;
public class Q34 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a number: ");
	        int num = scanner.nextInt();
	        int multiplier = 1;
	        System.out.println("Multiplication table for " + num + ":");
	        while (multiplier <= 10) {
	            System.out.println(num + " x " + multiplier + " = " + (num * multiplier));
	            multiplier++;
	        }
	        scanner.close();
	    }
}
