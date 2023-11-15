//41.	Create a program to reverse a number using a do-while loop.
package mylearning11thnov;
import java.util.Scanner;
public class Q41 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        String input = scanner.nextLine();
        StringBuilder reversed = new StringBuilder();
        if (input.startsWith("0")) {
            reversed.append("0");
        }
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        System.out.println("Reversed Number: " + reversed.toString());
        scanner.close();
    }
}
