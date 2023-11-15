//8.	Create a program to find the square root of a number.
package mylearning11thnov;
import java.util.Scanner;
public class QS8 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("The square root of negative numbers is not defined in real numbers.");
        } else {
            double squareRoot = Math.sqrt(num);
            System.out.printf("The square root of %d is %.2f.%n", num, squareRoot);
        scanner.close();
        }
    }
}
