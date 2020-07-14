package CodingBat.Array2;
/*
Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
 */

public class modThree {
    public static boolean modThree(int[] nums) {
        int countEven = 0;//четные
        int countOdd = 0;//нечетные
        final int FINAL_COUNT = 3;

        for (int count : nums){
            if (count % 2 == 0) {
                countEven++;
                countOdd = 0;
            }else {
                countOdd++;
                countEven = 0;
            }

            if (countEven >= FINAL_COUNT || countOdd >= FINAL_COUNT) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(modThree(new int []{2, 1, 3, 5})); //→ true
        System.out.println(modThree(new int []{2, 1, 2, 5})); //→ false
        System.out.println(modThree(new int []{2, 4, 2, 5}));// → true)
        System.out.println(modThree(new int []{}));// → false)
        System.out.println(modThree(new int []{2, 2, 3, 7, 9, 11, 6}));// → true);
        System.out.println(modThree(new int []{1, 0, 0, 0}));// → true);
    }

}
