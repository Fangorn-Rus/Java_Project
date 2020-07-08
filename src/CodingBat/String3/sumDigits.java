package CodingBat.String3;
/*
Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters.
Return 0 if there are no digits in the string.
(Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
 */

public class sumDigits {
    public static int sumDigits(String str) {
        int count = 0;
        char countChar;
        String countS;

        for (int i = 0; i < str.length(); i++) {
            countChar = str.charAt(i);
            if (Character.isDigit(countChar)) {
                countS = String.valueOf(countChar);
                count += Integer.parseInt(countS);
                countS = null;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits("hel31lo1"));
        System.out.println(sumDigits("aa11b33"));
        System.out.println(sumDigits("Chocolate"));
    }

}
