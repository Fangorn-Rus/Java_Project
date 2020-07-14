package CodingBat.Array2;

public class sum13 {
    //Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky,
    // so it does not count and numbers that come immediately after a 13 also do not count.
    public int sum13(int[] nums) {
        if (nums.length == 0) return 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
                continue;
            }
            else{
                result += nums[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new sum13().sum13(new int[] {1, 2, 2, 1, 13, 6, 13}));
    }

}
