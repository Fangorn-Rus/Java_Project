package CodingBat.Array2;
/*
Given arrays nums1 and nums2 of the same length, for every element in nums1,
consider the corresponding element in nums2 (at the same index).
Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
 */

public class matchUp {
    public static int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        int del;

        for (int i = 0; i < nums1.length; i++) {
            if (!(nums1[i] == nums2[i])) {
                del = Math.abs(nums1[i] - nums2[i]);
                if (del <= 2 && del > 0) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(matchUp(new int[]{1, 2, 3}, new int[]{2, 3, 10}));
    }

}
