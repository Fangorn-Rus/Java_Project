package CodingBat.Array2;
/*
Given an array of ints, return true if the array contains two 7's next to each other,
or there are two 7's separated by one element, such as with {7, 1, 7}.
НЕ РЕШЕНО!
 */

public class has77 {
    public static boolean has77(int[] nums) {
        final int SEVEN = 7;

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == SEVEN) {
                if (nums[i + 1] == SEVEN || nums[i + 2] == SEVEN) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new int[] {2, 7, 2, 2, 7, 7});
    }

}
