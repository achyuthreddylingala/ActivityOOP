//49.	Write a Java program to find the index of an array element. 
package mylearning11thnov;
public class Q49 {
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        System.out.println("Target value: " + target);
        int index = findIndex(array, target);
        if (index != -1) {
            System.out.println("Index of target value: " + index);
        } else {
            System.out.println("Target value not found in the array.");
        }
    }
    public static int findIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
