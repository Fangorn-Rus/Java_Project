package CodingBat.String2;

public class sameStarChar {
    //Returns true if for every '*' (star) in the string, if there are chars both
    // immediately before and after the star, they are the same.
    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) == (str.charAt(i + 1))) {
                    i++;
                    continue;
                }
                else return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new sameStarChar().sameStarChar("*xa*az*y"));
    }

}
