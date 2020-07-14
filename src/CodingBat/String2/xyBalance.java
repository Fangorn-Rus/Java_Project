package CodingBat.String2;

public class xyBalance {
    //    We'll say that a String is xy-balanced if for all the 'x' chars in the string,
    //    there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not.
    //    One 'y' can balance multiple 'x's.
    //Return true if the given string is xy-balanced.

    public boolean xyBalance(String str) {
        OUTER:
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                INNER:
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) == 'y') {
                        i += j - 1;
                        continue OUTER;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new xyBalance().xyBalance("xxx1234yxxyy"));
    }

}
