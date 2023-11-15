//10.	Create a program to check if a number is positive, negative, or zero.
package mylearning11thnov;
import java.util.Scanner;
public class Q10 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = scanner.nextDouble();
        if (number > 0) {
            System.out.println("The number is positive.");
        } 
        else if (number < 0) {
            System.out.println("The number is negative.");
        } 
        else {
            System.out.println("The number is zero.");
        }
                scanner.close();
    }
}
