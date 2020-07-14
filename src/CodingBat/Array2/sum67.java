package CodingBat.Array2;

public class sum67 {
    //Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7
    // (every 6 will be followed by at least one 7). Return 0 for no numbers.
    public int sum67(int[] nums) {
        int result = 0;
        OUTER:
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) {
                int countIndex = 0;
                INNER:
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 7) countIndex++;
                    else {
                        i += countIndex + 1;
                        continue OUTER;
                    }
                }
            } else {
                result += nums[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new sum67().sum67(new int[] {1, 1, 6, 7, 2}));
    }

}
