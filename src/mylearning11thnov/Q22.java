//22.	Create a program to find the roots of a quadratic equation.
package mylearning11thnov;
import java.util.Scanner;
public class Q22 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the coefficients a, b, and c: ");
	        double a = scanner.nextDouble();
	        double b = scanner.nextDouble();
	        double c = scanner.nextDouble();
	        double discriminant = b * b - 4 * a * c;
	        if (discriminant > 0) {
	            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
	            System.out.println("The roots are " + root1 + " and " + root2);
	        } else if (discriminant == 0) {
	            double root = -b / (2 * a);
	            System.out.println("The root is " + root);
	        } else {
	            System.out.println("The equation has no real roots.");
	        scanner.close();
	        }
	    }
}
