package CodingBat.Array2;

public class countEvens {
    //Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
    public int countEvens(int[] nums) {
        int countEvens = 0;
        for (int i: nums) {
            if (i % 2 == 0) countEvens++;
        }
        return countEvens;
    }

    public static void main(String[] args) {
        System.out.println(new countEvens().countEvens(new int[]{2, 1, 2, 3, 4}));
    }

}
