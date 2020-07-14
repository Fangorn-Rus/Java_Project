package CodingBat.String2;

public class mixString {
   // Given two strings, a and b, create a bigger string made of the first char of a,
    // the first char of b, the second char of a, the second char of b, and so on.
    // Any leftover chars go at the end of the result.

    public String mixString(String a, String b) {
        StringBuilder result = new StringBuilder(a.length() + b.length());
        String minString;
        String maxString;
        int iCount = 0;
        char aChar;
        char bChar;

        if (a.length() < b.length()) {
            minString = a;
            maxString = b;
        }
        else {
            minString = b;
            maxString = a;
        }

        for (iCount = 0; iCount < minString.length(); iCount++) {
            aChar = a.charAt(iCount);
            bChar = b.charAt(iCount);

            if (aChar != 0) result.append(aChar);
            if (bChar != 0) result.append(bChar);
        }
        for (int i = iCount; i < maxString.length(); i++) {
            result.append(maxString.charAt(i));
        }

        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println(new mixString().mixString("xxxx", "There"));
    }
}
