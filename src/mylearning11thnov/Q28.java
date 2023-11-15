//28.	Create a program to check if a character is a vowel or a consonant using a switch statement.
package mylearning11thnov;
import java.util.Scanner;
public class Q28 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a character: ");
	        char input = scanner.next().charAt(0);
	        switch (Character.toLowerCase(input)) {
	            case 'a':
	            case 'e':
	            case 'i':
	            case 'o':
	            case 'u':
	                System.out.println("The character is a vowel.");
	                break;
	            case ' ':
	                System.out.println("The character is a space.");
	                break;
	            default:
	                if (Character.isLetter(input)) {
	                    System.out.println("The character is a consonant.");
	                } 
	                else {
	                    System.out.println("The character is neither a vowel nor a consonant.");
	        	        scanner.close();
	                }
	                break;
	        }
	    }
}
