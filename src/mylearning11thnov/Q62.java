//62.	Write a Java program to add two matrices of the same size. 
package mylearning11thnov;
import java.util.*;
public class Q62 {
	 public static void main(String[] args) {
	        int[][] firstMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	        int[][] secondMatrix = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
	        System.out.println("First matrix: " + Arrays.deepToString(firstMatrix));
	        System.out.println("Second matrix: " + Arrays.deepToString(secondMatrix));
	        int[][] sumMatrix = addMatrices(firstMatrix, secondMatrix);
	        System.out.println("Sum matrix: " + Arrays.deepToString(sumMatrix));
	    }
	    public static int[][] addMatrices(int[][] firstMatrix, int[][] secondMatrix) {
	        int rows = firstMatrix.length;
	        int cols = firstMatrix[0].length;
	        if (rows != secondMatrix.length || cols != secondMatrix[0].length) {
	            throw new IllegalArgumentException("Both matrices must have the same dimensions.");
	        }
	        int[][] sumMatrix = new int[rows][cols];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
	            }
	        }
	        return sumMatrix;
	    }
}
