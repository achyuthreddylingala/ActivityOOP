//11.	Write a program to determine the largest among three numbers.
package mylearning11thnov;
import java.util.Scanner;
public class Q11 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();
        if (num1 > num2 && num1 > num3) {
           System.out.println("The largest of three numbers is num1:" + num1);
        }
        else if (num2 > num3 && num2 > num1) {
            System.out.println("The largest of three numbers is num2:" + num2);
        }
        else {
        System.out.println("The largest of three numbers is num3: " + num3);
        scanner.close();
	}
}
}

