//13.	Write a program to check if a year is a leap year using if-else statements.
package mylearning11thnov;
import java.util.Scanner;
public class Q13 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a year: ");
	        int year = scanner.nextInt();
	        if (year % 4 == 0) {
	            if (year % 100 == 0) {
	                if (year % 400 == 0) {
	                    System.out.println("The year " + year + " is a leap year.");
	                } else {
	                    System.out.println("The year " + year + " is not a leap year.");
	                }
	            } 
	            else {
	                System.out.println("The year " + year + " is a leap year.");
	            }
	        } 
	        else {
	            System.out.println("The year " + year + " is not a leap year.");
	            scanner.close();
	        }
	    }
}
