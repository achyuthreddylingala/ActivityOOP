//55.	Write a Java program to find duplicate values in an array of integer values.
package mylearning11thnov;
import java.util.*;
public class Q55 {
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 4, 6};
        System.out.println("Original array: " + Arrays.toString(array));
        int[] duplicateValues = findDuplicates(array);
        System.out.println("Duplicate values: " + Arrays.toString(duplicateValues));
    }
    public static int[] findDuplicates(int[] array) {
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        for (int i : array) {
            if (!set.add(i)) {
                list.add(i);
            }
        }
        int[] duplicates = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            duplicates[i] = list.get(i);
        }
        return duplicates;
    }
}
