//45.	Write a program to find the factorial of a number using a for loop.
package mylearning11thnov;
import java.util.Scanner;
public class Q45 {
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a number:");
	        int num = scanner.nextInt();
	        long factorial = getFactorial(num);
	        System.out.println("The factorial of " + num + " is " + factorial);
	        scanner.close();
	    }
	    public static long getFactorial(int num) {
	        long factorial = 1;
	        for (int i = 1; i <= num; i++) {
	            factorial *= i;
	        }
	        return factorial;
	    }
}
