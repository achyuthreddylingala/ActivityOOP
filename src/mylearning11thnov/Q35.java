//35.	Write a program to calculate the power of a number using a while loop.
package mylearning11thnov;
import java.util.Scanner;
public class Q35 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Enter a positive integer to calculate the power: ");
        int power = scanner.nextInt();
        long result = 1;
        while (power > 0) {
            result *= num;
            power--;
        }
        System.out.println(num + " raised to the power " + power + " is " + result);
        scanner.close();
    }
}
