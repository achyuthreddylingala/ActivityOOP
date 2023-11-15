//63.	Write a Java program to test two arrays' equality. 
package mylearning11thnov;
public class Q63 {
	public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {1, 2, 3, 4, 5};
        int[] thirdArray = {1, 2, 3, 4, 6};
        System.out.println("Are firstArray and secondArray equal? " + areEqual(firstArray, secondArray));
        System.out.println("Are firstArray and thirdArray equal? " + areEqual(firstArray, thirdArray));
    }
    public static boolean areEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
