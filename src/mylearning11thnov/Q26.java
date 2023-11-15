//26.	Write a program to find the discount based on the total purchase amount.
package mylearning11thnov;
import java.util.Scanner;
public class Q26 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the total purchase amount: ");
	        double totalPurchaseAmount = scanner.nextDouble();
	        double discountPercentage = 0;
	        if (totalPurchaseAmount >= 10000) {
	            discountPercentage = 15;
	        } else if (totalPurchaseAmount >= 5000) {
	            discountPercentage = 10;
	        } else if (totalPurchaseAmount >= 1000) {
	            discountPercentage = 5;
	        }
	        double discountAmount = (totalPurchaseAmount * discountPercentage) / 100;
	        System.out.println("The discount amount is: " + discountAmount);
            scanner.close();
	 }
}
