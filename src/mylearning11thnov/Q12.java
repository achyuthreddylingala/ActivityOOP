//12.	Create a program to check if a character is a vowel or a consonant.
package mylearning11thnov;
import java.util.Scanner;
public class Q12 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char input = scanner.next().charAt(0);
        if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u' ||
            input == 'A' || input == 'E' || input == 'I' || input == 'O' || input == 'U') {
            System.out.println("The input character is a vowel.");
        } 
        else if (Character.isLetter(input)) {
            System.out.println("The input character is a consonant.");
        } 
        else {
            System.out.println("The input is not a valid character.");
        scanner.close();
        }
    }
}
