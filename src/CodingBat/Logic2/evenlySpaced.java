package CodingBat.Logic2;

public class evenlySpaced {
    /*
    Given three ints, a b c, one of them is small, one is medium and one is large.
    Return true if the three values are evenly spaced,
    so the difference between small and medium is the same as the difference between medium and large.
     */
    public boolean evenlySpaced(int a, int b, int c) {
        if ((a == b) & (a == c)) {
            return true;
        } else {
            if (((a > b) && (a < c)) || ((a < b) && (a > c))) {
                return (Math.abs(a - b) == Math.abs(a - c));
            }
            if (((b > a) && (b < c)) || ((b < a) && (b > c))) {
                return (Math.abs(b - c) == Math.abs(b - a));
            }
            if (((c > a) && (c < b)) || ((c < a) && (c > b))) {
                return (Math.abs(c - a) == Math.abs(c - b));
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(new evenlySpaced().evenlySpaced(6, 2, 8));
    }

}
