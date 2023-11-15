//19.	Create a program to check if a number is even and positive.
package mylearning11thnov;
import java.util.Scanner;
public class Q19 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println(num + " is an even positive number.");
            } 
            else {
                System.out.println(num + " is an odd positive number.");
            }
        } 
        else {
            System.out.println(num + " is not a positive number.");
        scanner.close();
        }
    }
}
