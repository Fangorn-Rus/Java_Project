package CodingBat.Array2;
/*

Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.

 */

public class has12 {
    public static boolean has12(int[] nums) {
        final int ONE = 1;
        final int TWO = 2;

        boolean isOne = false;
        boolean isTwo = false;

        for (int i = 0; i < nums.length; i++) {
            if (!isOne && nums[i] == ONE) isOne = true;
            if (isOne && !isTwo && nums[i] == TWO) {
                isTwo = true;
                break;
            }
        }
        return isOne & isTwo;
    }

    public static void main(String[] args) {
        System.out.println(has12(new int []{3, 1 ,4, 5, 2}));
    }

}
