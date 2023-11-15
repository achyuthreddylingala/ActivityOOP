/*90(b)b.	
1
12
123
1234
12345
123456
*/
package mylearning11thnov;
import java.util.Scanner;
public class Q90b {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        scanner.close();
    }
}
