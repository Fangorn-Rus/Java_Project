package CodingBat.String2;

import org.w3c.dom.ls.LSOutput;

public class repeatEnd {
    //Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
    // You may assume that n is between 0 and the length of the string, inclusive.

    public String repeatEnd(String str, int n) {
        String subStr = str.substring(str.length() - n);
        StringBuilder result = new StringBuilder(str.length() * str.length());

        for (int i = 0; i < n; i++) {
            result.append(subStr);
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println(new repeatEnd().repeatEnd("Hello", 5));
    }

}
