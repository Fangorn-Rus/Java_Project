package CodingBat.Array2;

public class centeredAverage {
    //Return the "centered" average of an array of ints, which we'll say is the mean average of
    // the values, except ignoring the largest and smallest values in the array. If there are multiple copies
    // of the smallest value, ignore just one copy, and likewise for the largest value.
    // Use int division to produce the final average. You may assume that the array is length 3 or more.
    public int centeredAverage(int[] nums) {
        int result = 0;
        int minInt = nums[0];
        int maxInt = nums[0];
        int maxIntIndex = 0;
        int minIntIndex = 0;
        int countIntsWithout2 = nums.length - 2;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxInt) {
                maxInt = nums[i];
                maxIntIndex = i;
            }
            else if (nums[i] < minInt) {
                minInt = nums[i];
                minIntIndex = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == minIntIndex || i == maxIntIndex) continue;
            result += nums[i];
        }
        return result / countIntsWithout2;
    }

    public static void main(String[] args) {
        System.out.println(new centeredAverage().centeredAverage(new int[] {7, 7, 7}));
    }

}
