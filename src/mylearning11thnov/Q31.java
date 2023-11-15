//31.	Write a program to find the factorial of a number using a while loop.
package mylearning11thnov;
import java.util.Scanner;
public class Q31 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int factorial = 1;  
        int i = 1;         
        while (i <= num) {
            factorial *= i;
            i++;
        }
        System.out.println("The factorial of " + num + " is: " + factorial);
    scanner.close();
    }
}
