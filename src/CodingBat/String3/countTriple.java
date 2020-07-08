package CodingBat.String3;

/*

We'll say that a "triple" in a string is a char appearing three times in a row.
Return the number of triples in the given string. The triples may overlap.
 */
public class countTriple {
    public static int countTriple(String str) {
        int count = 0; //счетчик входов 3 букв
        StringBuilder strCount = new StringBuilder(str).append("  ");
        //int countJ;
        char strI;


        if (strCount.length() >= 3) {
            for (int i = 0; i < strCount.length() - 2; i++) {
                strI = strCount.charAt(i);
                //countJ = 0;
                if (strCount.charAt(i + 1) == strI && strCount.charAt(i + 2) == strI) count++;
            }
            return count;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(countTriple("abcXXXabc")); // 1
        System.out.println(countTriple("xxxabyyyycd")); // 3
        System.out.println(countTriple("a"));// 0
    }

}
