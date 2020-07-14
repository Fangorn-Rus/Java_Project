package CodingBat.Logic1;

public class teenSum {
    /*
        Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive,
        are extra lucky. So if either value is a teen, just return 19.
     */
    static int teenSum(int a, int b) {
        if ((a >= 13 & a <= 19) || (b >=13 & b <= 19)) return 19;

        int sum = a + b;
        if (sum >= 13 & sum <= 19) return 19;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(teenSum(12, 4));
    }

}
