package CodingBat.Logic1;

public class sortaSum {
    static int sortaSum(int a, int b) {
        /*
        Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden,
        so in that case just return 20.
         */
        int intSum = a + b;
        if (intSum >= 10 & intSum <= 19) return 20; else return intSum;
    }

    public static void main(String[] args) {
        System.out.println(sortaSum(10, 11));
    }
}
