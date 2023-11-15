package mylearning11thnov;

public class Q48 {
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        System.out.println("Target value: " + target);
        System.out.println("Does the array contain the target value? " + contains(array, target));
    }
    public static boolean contains(int[] array, int target) {
        for (int num : array) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
