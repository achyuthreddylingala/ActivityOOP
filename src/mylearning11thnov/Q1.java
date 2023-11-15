//1.	Write a Java program to check if a number is even or odd.
package mylearning11thnov;
import java.util.Scanner;
public class Q1 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a number");
int num = scanner.nextInt();
{
	if(num%2 == 0) {
		System.out.println("The number is even");
	}
	else{
		System.out.println("The number is odd");
	}
}
	scanner.close();
}
}
