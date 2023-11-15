/*88.	Write a program to accept a grade and declare the equivalent description :  
Test Data : 
Input the grade :a
Expected Output :
You have chosen : Average*/
package mylearning11thnov;
import java.util.Scanner;
public class Q88 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the grade :");
        char grade = scanner.next().charAt(0);
        String description = ""; 
        scanner.close();
        switch (grade) {
            case 'E':
            case 'e':
                description = "Excellent";
                break;
            case 'V':
            case 'v':
                description = "Very Good";
                break;
            case 'G':
            case 'g':
                description = "Good";
                break;
            case 'A':
            case 'a':
                description = "Average";
                break;
            case 'F':
            case 'f':
                description = "Fail";
                break;
            default:
                System.out.println("Invalid input!");
                return;
        }
        System.out.println("You have chosen : " + description);
    }
}
