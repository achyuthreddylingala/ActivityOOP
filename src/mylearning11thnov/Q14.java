//14.	Create a program to compare two strings for equality.
package mylearning11thnov;
import java.util.Scanner;
public class Q14 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the first string: ");
	        String string1 = scanner.nextLine();
	        System.out.println("Enter the second string: ");
	        String string2 = scanner.nextLine();
	        if (string1.equals(string2)) {
	            System.out.println("The two strings are equal.");
	        } else {
	            System.out.println("The two strings are not equal.");
	        scanner.close();
	        }
	    }
}
