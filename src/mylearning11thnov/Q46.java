//46.	Create a program to print the multiplication table of a number using a for loop.
package mylearning11thnov;
import java.util.Scanner;
public class Q46 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        printMultiplicationTable(num);
        scanner.close();
    }
    public static void printMultiplicationTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
