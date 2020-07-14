package CodingBat.String2;

public class endOther {
    /*
    Given two strings, return true if either of the strings appears at the very end of the other string,
    ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
     Note: str.toLowerCase() returns the lowercase version of a string.
     */

    public boolean endOther(String a, String b) {
        String st1 = a.toLowerCase();
        String st2 = b.toLowerCase();

        return (st1.endsWith(st2)) || (st2.endsWith(st1));
    }

    public static void main(String[] args) {
        System.out.println(new endOther().endOther("AbC", ""));
    }

}
