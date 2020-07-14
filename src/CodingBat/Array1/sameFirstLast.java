package CodingBat.Array1;

public class sameFirstLast {
    /*
        Given an array of ints, return true if the array is length 1 or more,
        and the first element and the last element are equal.
     */
    static boolean sameFirstLast(int[] nums) {
        return nums.length > 0 && nums[0] == nums[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] array = {66, 2, 4, 66};
        System.out.println(sameFirstLast(array));
    }
}
