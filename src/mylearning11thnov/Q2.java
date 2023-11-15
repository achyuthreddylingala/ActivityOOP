//2.Write a program to calculate the average of three numbers.
package mylearning11thnov;
import java.util.Scanner;
public class Q2 {
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number a =");
		int a=scanner.nextInt();
		System.out.println("Enter a number b =");
		int b=scanner.nextInt();
		System.out.println("Enter a number c =");
		int c=scanner.nextInt();
		float average = 0;
		average = (a + b + c)/3;
		System.out.println(average);
		scanner.close();
		}		
	}



