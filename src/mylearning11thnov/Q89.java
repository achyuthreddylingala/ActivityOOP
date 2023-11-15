/*89.	Write a program to display the multiplication table of a given integer. 
Test Data :
Input the number (Table to be calculated) : 15 
Expected Output : 
15 X 1 = 15 
...
... 
15 X 10 = 150
*/
package mylearning11thnov;
import java.util.Scanner;
public class Q89 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number (Table to be calculated) : ");
        int number = scanner.nextInt();
        System.out.println("The multiplication table for " + number + " is:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + (number * i));
        }
        scanner.close();
    }
}
