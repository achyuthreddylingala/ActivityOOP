package mylearning11thnov;
import java.util.Scanner;
public class Q90g {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines (should be odd): ");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("Please enter an odd number.");
            return;

        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
                scanner.close();
            }
            System.out.println();
        }
    }
}
