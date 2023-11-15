//30.	Create a program to calculate the sum of natural numbers from 1 to N using a while loop.
package mylearning11thnov;
import java.util.Scanner;
public class Q30 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = scanner.nextInt();
    int sum = 0;  
    int i = 1;    
    while (i <= num) {
        sum += i;
        i++;
    }
    System.out.println("The sum of natural numbers from 1 to " + num + " is: " + sum);
scanner.close();
}
}
