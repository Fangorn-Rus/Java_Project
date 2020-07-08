package CodingBat.String3;
/*
Given a string and a non-empty word string, return a string
made of each char just before and just after every appearance
of the word in the string. Ignore cases where there is no char before or after the word,
and a char may be included twice if it is between two words.
 */

public class wordEnds {
    public String wordEnds(String str, String word) {
        StringBuilder result = new StringBuilder();
        int wordLen = word.length();
        int strLen = str.length();
        //char[] array = word.toCharArray();

        if ((strLen == wordLen && str.equals(word)) || strLen < wordLen) return "";
        else if (strLen > wordLen) {
            for (int i = 0; i <= strLen - wordLen; i++) {
                if (str.regionMatches(i, word, 0, wordLen))
                    if (i == 0) {
                        result.append(str.charAt(i + wordLen));
                    } else if (i == str.length() - wordLen) {
                        result.append(str.charAt(i - 1));
                        //result.append(str.charAt(i + wordLen));
                    } else {
                        result.append(str.charAt(i - 1));
                        result.append(str.charAt(i + wordLen));
                    }

            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        //System.out.println(new wordEnds().wordEnds("abcXY123XYijk", "XY"));
        //System.out.println(new wordEnds().wordEnds("XY", "XY"));
        System.out.println(new wordEnds().wordEnds("XY123XY", "XY"));
    }

}
