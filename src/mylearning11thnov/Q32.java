//32.	Write a program to generate a Fibonacci series using a while loop.
package mylearning11thnov;
import java.util.Scanner;
public class Q32 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms for the Fibonacci series: ");
        int numOfTerms = scanner.nextInt();
        if (numOfTerms <= 0) {
            System.out.println("The number of terms should be a positive integer.");
        } else {
            long firstTerm = 0, secondTerm = 1;
            System.out.println("Fibonacci series: ");
            for (int i = 1; i <= numOfTerms; i++) {
                if (i == 1) {
                    System.out.print(firstTerm + " ");
                } else if (i == 2) {
                    System.out.print(secondTerm + " ");
                } else {
                    long nextTerm = firstTerm + secondTerm;
                    firstTerm = secondTerm;
                    secondTerm = nextTerm;
                    System.out.print(nextTerm + " ");
                }
            }
        }
        scanner.close();
    }
}
