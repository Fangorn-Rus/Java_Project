package CodingBat.Array2;
/*
Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.
 */

import java.net.FileNameMap;

public class haveThree {
    public static boolean haveThree(int[] nums) {
        int countDigit = 0;
        final int DIGIT = 3; // цифра для подсчета в массиве
        final int FINAL_COUNT = 3; //количество вхождений переменной DIGIT

        if (nums.length > FINAL_COUNT) {
            if (nums[0] == DIGIT) {
                if (nums[1] != DIGIT)
                countDigit++;
                else return false;
            }

            for (int i = 1; i < nums.length - 1; i++) {
                if (nums[i] == DIGIT) {
                    if (nums[i - 1] != DIGIT
                            && nums[i + 1] != DIGIT
                            && countDigit < FINAL_COUNT)
                        countDigit++;
                    else return false;
                }
            }
            if (nums[nums.length - 1] == DIGIT) {
                if (nums[nums.length - 2] != DIGIT)
                    countDigit++;
                else return false;
            }

            if (countDigit == FINAL_COUNT) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        //System.out.println(new int []{1, 3, 1, 3, 2, 3}); //true
       // System.out.println(new int []{1, }); //false
        //System.out.println(new int []{1, 3, 1, 3, 3, 100}); //false
        //System.out.println(new int []{3, 1, 3, 1, 3}); //true
        System.out.println(new int []{1, 3, 1, 3, 1, 3}); //true
    }

}
