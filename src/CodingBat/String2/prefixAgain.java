package CodingBat.String2;

public class prefixAgain {
    //Given a string, consider the prefix string made of the
    // first N chars of the string. Does that prefix string appear somewhere
    // else in the string? Assume that the string is not empty and that N is in the range 1..str.length().
    public boolean prefixAgain(String str, int n) {
        String eqStr = str.substring(0, n);
        for (int i = n; i < str.length() - n; i += (n - 1)) {
            if(eqStr.equals(str.substring(i, i + n))) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new prefixAgain().prefixAgain("Hi12345Hi6789Hi10", 4));
    }



}
