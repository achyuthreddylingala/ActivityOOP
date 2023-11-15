//3.	Create a program to find the maximum of two numbers.
package mylearning11thnov;
import java.util.Scanner;
public class Q3 {
	public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	System.out.println("Enter a number a=");
	int a = kb.nextInt();
	System.out.println("Enter a number b=");
	int b = kb.nextInt();
	int c = Math.max(a, b);
	System.out.println("The maximum of a and b is c: " + c);
	kb.close();
}
}
