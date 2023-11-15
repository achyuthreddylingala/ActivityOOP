//23.	Write a program to determine the day of the week based on a number.
package mylearning11thnov;
import java.util.Scanner;
public class Q23 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (1-7): ");
        int dayNumber = scanner.nextInt();
        String dayOfWeek;
        switch (dayNumber) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "Invalid number"; // If the input number is outside the range 1-7
                break;
        }
        System.out.println("The day of the week is: " + dayOfWeek);
        scanner.close();
    }

}
