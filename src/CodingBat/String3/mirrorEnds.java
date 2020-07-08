package CodingBat.String3;

/*

Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
In other words, zero or more characters at the very begining of the given string, and at the very
end of the string in reverse order (possibly overlapping).
For example, the string "abXYZba" has the mirror end "ab".
 */
public class mirrorEnds {
    public static String mirrorEnds(String string) {
        StringBuilder result = new StringBuilder();
        char countCh;
        int strLen = string.length();

        if (strLen == 0) return "";

        for (int i = 0, j = strLen - 1; i <= strLen/2; i++, j--) {
            if (i == j) return string;
            if ((countCh = string.charAt(i)) == string.charAt(j)) result.append(countCh);
            else break;
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println(mirrorEnds("")); //→ "ab"
        System.out.println(mirrorEnds("abca"));// → "a"
        System.out.println(mirrorEnds("aba"));// → "aba"
    }

}
