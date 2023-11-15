//40.	Write a program to generate a Fibonacci series using a do-while loop.
package mylearning11thnov;
public class Q40 {
	public static void main(String[] args) {
        int n = 10; 
        int t1 = 0, t2 = 1; 
        System.out.print("First " + n + " terms in the Fibonacci series: ");
        do {
            System.out.print(t1);
            if (n > 1) {
                System.out.print(", ");
            }
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            n--;
        } while (n > 0);
        System.out.println(); 
        }
}
