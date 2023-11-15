//56.	Write a Java program to find duplicate values in an array of string values. 
package mylearning11thnov;
import java.util.*;
public class Q56 {
	 public static void main(String[] args) {
		 	String[] array = {"Apple", "Banana", "Cherry", "Apple", "Banana", "Durian"};
	        System.out.println("Original array: " + Arrays.toString(array));
	        String[] duplicateValues = findDuplicates(array);
	        System.out.println("Duplicate values: " + Arrays.toString(duplicateValues));
	    }
	    public static String[] findDuplicates(String[] array) {
	        Set<String> set = new HashSet<>();
	        Set<String> duplicates = new HashSet<>();
	        for (String str : array) {
	            if (!set.add(str)) {
	                duplicates.add(str);
	            }
	        }
	        String[] result = new String[duplicates.size()];
	        duplicates.toArray(result);
	        return result;
	    }
}
