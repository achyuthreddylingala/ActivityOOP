//9.	Write a Java program to check if a person is eligible to vote.
package mylearning11thnov;
import java.util.Scanner;
public class Q9 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        scanner.close();
        }
    }
}
