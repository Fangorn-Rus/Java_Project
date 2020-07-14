package CodingBat.Array1;

public class firstLast6 {
    /*
    Given an array of ints, return true if 6 appears as either the first or last element in the array.
    he array will be length 1 or more.
     */
    static boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    public static void main(String[] args) {
        int[] array = {6, 4, 5, 0};

        System.out.println(firstLast6(array));
    }

}
