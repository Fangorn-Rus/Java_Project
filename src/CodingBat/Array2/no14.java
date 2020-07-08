package CodingBat.Array2;

//Given an array of ints, return true if it contains no 1's or it contains no 4's.

public class no14 {
    public static boolean no14(int[] nums) {
        final byte ONE = 1;
        final byte FOUR = 4;

        if (nums.length > 0){
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == ONE){
                    for (int j = i + 1; j < nums.length; j++) if (nums[j] == FOUR) return false;
                }
                if (nums[i] == FOUR){
                    for (int j = i + 1; j < nums.length; j++) if (nums[j] == ONE) return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(no14(new int[]{1, 2, 3})); //→ true
        System.out.println(no14(new int[]{1, 2, 3, 4}));// → false
        System.out.println(no14(new int[]{2, 3, 4})); //→ true
    }

}
