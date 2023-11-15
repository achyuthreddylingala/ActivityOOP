//6.	Write a program to swap two numbers.
package mylearning11thnov;
import java.util.Scanner;
public class Q6 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int y = scanner.nextInt();
        System.out.println("Before swapping, x is " + x + " and y is " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping, x is " + x + " and y is " + y);
    scanner.close();
    }
}
