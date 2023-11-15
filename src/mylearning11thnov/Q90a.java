/*90.	Print the following patterns using loop getting the number of line from user:
a.	
5
45
345
2345
12345
*/
package mylearning11thnov;
import java.util.Scanner;
public class Q90a {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of lines: ");
	        int n = scanner.nextInt();
	        for (int i = 0; i < n; i++) {
	            for (int j = i; j >= 0; j--) {
	                System.out.print(n - j);
	            }
	            System.out.println();
	        }
	        scanner.close();
	    }
}
