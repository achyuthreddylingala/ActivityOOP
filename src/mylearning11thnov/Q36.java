//36.	Create a program to calculate the square of a number using a while loop.
package mylearning11thnov;
import java.util.Scanner;
public class Q36 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        scanner.close();
        int result = 0;
        int counter = 1;
        while (counter <= num) {
        result += num;
        counter++;
        }
        System.out.println("The square of " + num + " is " + result);
    }
}
