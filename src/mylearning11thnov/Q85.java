/*85.	Write a program to display the cube of the number up to given an integer. 
Test Data :
Input number of terms : 5 
Expected Output : 
Number is : 1 and cube of the 1 is :1 
Number is : 2 and cube of the 2 is :8 
Number is : 3 and cube of the 3 is :27 
Number is : 4 and cube of the 4 is :64 
Number is : 5 and cube of the 5 is :125
*/
package mylearning11thnov;
import java.util.Scanner;
public class Q85 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of terms : ");
        int n = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= n; i++) {
            System.out.println("Number is : " + i + " and cube of the " + i + " is :" + i * i * i);
        }
    }
}
