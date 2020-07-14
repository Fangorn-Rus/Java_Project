package CodingBat.String2;

public class countCode {
    //Return the number of times that the string "code" appears anywhere in the given string,
    // except we'll accept any letter for the 'd', so "cope" and "cooe" count.
    public int countCode(String str) {
        int countCode = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if ((str.charAt(i) == 'c') && (str.charAt(i + 1) == 'o') && (str.charAt(i + 3)) == 'e') countCode++;
        }
        return countCode;
    }

    public static void main(String[] args) {
        System.out.println(new countCode().countCode("xxxcoozcopecodecoof"));
    }
}


