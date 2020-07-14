package CodingBat.Array2;

public class bigDiff {
    //Given an array length 1 or more of ints, return the difference between the largest
    // and smallest values in the array. Note: the built-in Math.min(v1, v2)
    // and Math.max(v1, v2) methods return the smaller or larger of two values.
    public int bigDiff(int[] nums) {
        int minInt = nums[0];
        int maxInt = nums[0];
        for (int i : nums) {
            minInt = Math.min(i, minInt);
            maxInt = Math.max(i, maxInt);
        }
        return maxInt - minInt;
    }

    public static void main(String[] args) {
        System.out.println(new bigDiff().bigDiff(new int[] {10, 2, 5, 6}));
    }

}
