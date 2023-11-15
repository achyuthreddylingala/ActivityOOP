//27.	Write a program to determine the number of days in a month using a switch statement.
package mylearning11thnov;
import java.util.Scanner;
public class Q27 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month number (1-12): ");
        int monthNumber = scanner.nextInt();
        switch (monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Number of days: 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Number of days: 30");
                break;
            case 2:
                System.out.println("Number of days: 28 or 29 (in case of a leap year)");
                break;
            default:
                System.out.println("Invalid month number.");
                scanner.close();
                break;
        }
    }
}
