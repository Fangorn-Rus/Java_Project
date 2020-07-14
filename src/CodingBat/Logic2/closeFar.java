package CodingBat.Logic2;

public class closeFar {
    /*
        Given three ints, a b c, return true if one of b or c is "close"
        (differing from a by at most 1), while the other is "far",
        differing from both other values by 2 or more. Note:
        Math.abs(num) computes the absolute value of a number.
     */
    public boolean closeFar(int a, int b, int c) {
        return (b - a == 1 | c - a == 1) & (b - c >= 2 || c - b >= 2);
    }

    public static void main(String[] args) {
        System.out.println(new closeFar().closeFar(4,1,3));
    }

}
