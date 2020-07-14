package CodingBat.Array2;

public class has22 {
    //    Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
    public boolean has22(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if((nums[i] == 2) && (i != 0) && (nums[i - 1] == 2)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new has22().has22(new int[] {1, 2, 2}));
    }
}
