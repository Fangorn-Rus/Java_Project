package CodingBat.Logic1;

public class old35 {
    /*
        Return true if the given non-negative number is a multiple of 3 or 5, but not both.
        Use the % "mod" operator -- see Introduction to Mod
     */
    static boolean old35(int n) {
        boolean n3 = n % 3 == 0;
        boolean n5 = n % 5 == 0;

        if (n3 && n5) return false;
        else return (n3 || n5);
    }

    public static void main(String[] args) {
        System.out.println(old35(15));
    }
}
