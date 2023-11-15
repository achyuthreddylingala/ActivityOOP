//34.	Create a program to print the multiplication table of a number using a while loop.
package mylearning11thnov;
import java.util.Scanner;
public class Q33 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number: " + reversedNum);
        scanner.close();
    }
}
