package CodingBat.Array2;
/*
We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array,
at least one of the pair is that value. Return true if the given value is everywhere in the array.

ЗАДАНИЕ НЕ ЯСНО! НЕ РЕШЕНО!
 */

public class isEverywhere {
    public static boolean isEverywhere(int[] nums, int val) {
        final int VAL = val;

        if (nums.length > 1){

            if (nums[0] != VAL && nums[1] != VAL) return false;

            for (int i = 1; i < nums.length - 1; i++) {
                if (nums[i] != VAL && (nums[i - 1] != VAL && nums[i + 1] != VAL)) return false;
            }

            if (nums[nums.length - 1] != VAL && nums[nums.length - 2] != VAL) return false;
        }
        else if (nums.length > 0) if (nums[nums.length - 1] != VAL) return true;
        return true;
    }

    public static void main(String[] args) {
        //System.out.println(isEverywhere(new int[] {1, 2, 1, 3}, 2));// → false
        //System.out.println(isEverywhere(new int[] {1, 2, 1, 3, 4}, 1)); //→ false
        System.out.println(isEverywhere(new int[] {3}, 1));
        System.out.println(isEverywhere(new int[] {2, 1, 2, 1, 1, 2}, 2));// → true
    }
}
