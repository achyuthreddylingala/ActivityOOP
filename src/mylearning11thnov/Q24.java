//24.	Create a program to check if a number is even, odd, or prime using else-if statements.
package mylearning11thnov;
import java.util.Scanner;
public class Q24 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        if (isPrime(number)) {
            System.out.println(number + " is prime.");
        } else {
            System.out.println(number + " is not prime.");
        scanner.close();
        }
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
