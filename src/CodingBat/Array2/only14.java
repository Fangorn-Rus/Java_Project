package CodingBat.Array2;

public class only14 {
    //Given an array of ints, return true if every element is a 1 or a 4.
    public boolean only14(int[] nums) {
        boolean isNotOne = true;
        boolean isNotFour = true;
        for (int count : nums) {
            if (isNotOne && count != 1) isNotOne = false;
        }
        for (int count : nums) {
            if (isNotFour && count != 4) isNotFour = false;
        }

        return (isNotOne || isNotFour);
    }

}
