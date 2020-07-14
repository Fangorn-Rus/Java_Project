package CodingBat.Array2;
/*
Given an array of ints, return true if every 2 that appears in the array is next to another 2.
 */

import Lesson10.p4.D;

public class twoTwo {
    public static boolean twoTwo(int[] nums) {
        final int DIGIT = 2;

        if (nums.length > 1){
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == DIGIT) {
                    if (nums[i + 1] == DIGIT){
                        i++;
                    }
                    else return false;
                }
            }

            if (nums[nums.length - 1] == DIGIT && nums[nums.length - 2] != DIGIT){
                return false;
            }
            return true;
        }else
            if(nums.length == 0 || nums[0] != DIGIT) return true;
            else return false;
    }

    public static void main(String[] args) {
        System.out.println(new int[]{2, 2, 4, 2}); //false
    }

}
