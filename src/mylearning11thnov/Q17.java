//17.	Write a program to find the largest of three numbers using nested if-else statements.
package mylearning11thnov;
import java.util.Scanner;
public class Q17 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num1 >= num2) {
            if (num1 >= num3) {
                System.out.println(num1 + " is the largest number.");
            } 
            else {
                System.out.println(num3 + " is the largest number.");
            }
        } 
        else {
            if (num2 >= num3) {
                System.out.println(num2 + " is the largest number.");
            } 
            else {
                System.out.println(num3 + " is the largest number.");
           scanner.close();
           }
        }
    }
}
