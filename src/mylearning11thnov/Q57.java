//57.	Write a Java program to find common elements between two arrays (string values). 
package mylearning11thnov;
import java.util.*;
public class Q57 {
	public static void main(String[] args) {
        String[] array1 = {"apple", "banana", "cherry", "date", "fig"};
        String[] array2 = {"cherry", "date", "fig", "grape", "kiwi"};
        String[] commonElements = findCommonElements(array1, array2);
        System.out.println("Common elements:");
        for (String element : commonElements) {
            System.out.println(element);
        }
    }
    public static String[] findCommonElements(String[] array1, String[] array2) {
        HashSet<String> set1 = new HashSet<>();
        for (String str : array1) {
            set1.add(str);
        }
        HashSet<String> commonSet = new HashSet<>();
        for (String str : array2) {
            if (set1.contains(str)) {
                commonSet.add(str);
            }
        }
        String[] commonElements = new String[commonSet.size()];
        commonSet.toArray(commonElements);
        return commonElements;
    }
}
