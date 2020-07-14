package CodingBat.Logic1;

public class less20 {
    /*
        Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for
        example 38 and 39 return true, but 40 returns false.
        See also: Introduction to Mod
     */

    static boolean less20(int n) {
        return (n + 1) % 20== 0  || (n + 2) % 20 == 0;
    }

    public static void main(String[] args) {
        System.out.println(less20(20));
    }

}
