package mylearning11thnov;
import java.util.Scanner;
public class Q18 {
public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = kb.nextInt();
	if(num>0) {
		System.out.println("The number is positive");
	}
	if(num<0) {
		System.out.println("The number is negative");
	}
	else {
		System.out.println("The number is zero");
	kb.close();
	}
}
}
