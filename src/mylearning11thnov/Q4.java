//4.Write a program to calculate the factorial of a number.
package mylearning11thnov;
import java.util.Scanner;
public class Q4 {
	public static void main(String[] args) {
		 Scanner kb = new Scanner(System.in);
	        System.out.println("Enter a number: ");
	        int num = kb.nextInt();
	        System.out.println("The factorial of " + num + " is " + factorial(num));
	        kb.close();
	    }
	    public static long factorial(int num) {
	        long result = 1;
	        for (int i = 1; i <= num; i++) {
	            result = result * i;
	        }
	        return result;
	       
	}

}
