//5.	Create a program to find the absolute value of a number without using the Math class.
package mylearning11thnov;
import java.util.Scanner;
public class Q5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        System.out.println("The absolute value of " + num + " is " + absoluteValue(num));
    }
    public static int absoluteValue(int num) {
        if (num < 0) {
            return num;
        } else {
            return num;
        }
    }
}
