package CodingBat.Array2;
/*
Return true if the group of N numbers at the start and end of the array are the same. For example,
with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2,
and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.
 */

import java.util.Arrays;

public class sameEnds {


    public static boolean sameEnds(int[] nums, int len) {

        int[] arrayStart = new int[len];
        int[] arrayFinish = new int[len];

        if (nums.length > 0) {
            int firstIdx = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != firstIdx) break;
            }

            for (int i = 0, j = nums.length - 1; i < len; i++, j--) {
                arrayStart[i] = nums[i];
                arrayFinish[i] = nums[j];
            }

            if (Arrays.equals(arrayStart, arrayFinish)) return false;
            else {
                Arrays.sort(arrayStart);
                Arrays.sort(arrayFinish);

                for (int i = 0; i < len; i++) {
                    if (arrayStart[i] != arrayFinish[i]) return false;
                }
            }


            return true;
        }
        return true;
    }

    public static void main(String[] args) {
//        System.out.println(sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 1)); //false
//        System.out.println(sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 2)); //true
//        System.out.println(sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 3)); //false
        System.out.println(sameEnds(new int[]{1, 2, 5, 2, 1}, 2)); //false
        System.out.println(sameEnds(new int[]{1, 1, 1}, 2)); //false
    }

}
