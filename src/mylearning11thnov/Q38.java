//38.	Create a program to calculate the sum of natural numbers from 1 to N using a do-while loop. 
package mylearning11thnov;
import java.util.Scanner;
public class Q38 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a positive integer:");
    int num = scanner.nextInt();
    scanner.close();
    if (num <= 0) {
        System.out.println("Number should be a positive integer.");
    } else {
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        } while (i <= num);
        System.out.println("The sum of natural numbers from 1 to " + num + " is " + sum + ".");
    }
}
}
