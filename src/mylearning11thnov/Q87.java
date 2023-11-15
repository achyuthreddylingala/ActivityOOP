//87.	Write a program to read n numbers from keyboard and find their sum and average
package mylearning11thnov;
import java.util.Scanner;
public class Q87 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Input the number of elements : ");
	        int n = scanner.nextInt();
	        System.out.println("Input " + n + " numbers : ");
	        int sum = 0; 
	        for (int i = 0; i < n; i++) {
	            int num = scanner.nextInt(); 
	            sum += num; 
	        }
	        double average = (double) sum / n;
	        System.out.println("The sum is : " + sum);
	        System.out.println("The average is : " + average);
	        scanner.close();
	    }
}
