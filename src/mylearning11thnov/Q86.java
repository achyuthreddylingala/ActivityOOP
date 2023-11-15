/*86.	Write a program to find the sum of the series 1 +11 + 111 + 1111 + .. n terms.  
Test Data : 
Input the number of terms : 5 
Expected Output :
1 + 11 + 111 + 1111 + 11111 + 
The Sum is : 12345
*/
package mylearning11thnov;
import java.util.Scanner;
public class Q86 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Input the number of terms : ");
	        int n = scanner.nextInt();
	        scanner.close();
	        int sum = 0; 
	        for (int i = 1; i <= n; i++) {
	            int currentNumber = Integer.parseInt(new String(new char[i]).replace("\0", "1"));
	            sum += currentNumber;
	        }
	        System.out.println("1 + 11 + 111 + 1111 + 11111 + ... 1" + new String(new char[n]).replace("\0", "1") + " + ");
	        System.out.println("The Sum is : " + sum);
	    }
}
