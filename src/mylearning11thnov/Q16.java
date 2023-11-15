//16.Create a program to check if a given number is a perfect square.
package mylearning11thnov;
import java.util.Scanner;
public class Q16 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (isPerfectSquare(number)) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is not a perfect square.");
        	scanner.close();
        	}
}
	public static boolean isPerfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return number == sqrt * sqrt;
    }
}
