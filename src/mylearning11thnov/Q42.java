//42.	Write a program to calculate the power of a number using a do-while loop.
package mylearning11thnov;
import java.util.Scanner;
public class Q42 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        System.out.println("Enter a positive integer to calculate the power:");
        int power = scanner.nextInt();
        if (power < 0) {
            System.out.println("Invalid input! Exponent should be a positive integer.");
        } else {
            int result = powerOf(num, power);
            System.out.println(num + " raised to the power " + power + " is " + result);
        }
        scanner.close();
    }
    private static int powerOf(int num, int power) {
        int result = 1;
        do {
            result *= num;
            power--;
        } while (power > 0);
        return result;
    }
}
