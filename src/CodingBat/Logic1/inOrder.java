package CodingBat.Logic1;

public class inOrder {
    /*
    Given three ints, a b c, return true if b is greater than a, and c is greater than b. However,
    with the exception that if "bOk" is true, b does not need to be greater than a.
     */
    static boolean inOrder(int a, int b, int c, boolean bOk) {
        return (c > b & b > a) | (c > b & bOk);
    }

    public static void main(String[] args) {
        System.out.println(inOrder(1, 1,2, true));
    }
}
