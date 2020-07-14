package CodingBat.String2;

public class oneTwo {
    //Given a string, compute a new string by moving the first char to come after
    // the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group
    //of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
    public String oneTwo(String str) {
        StringBuilder result = new StringBuilder(str.length());
        for (int i = 0; i < (str.length() - (str.length() % 3)); i += 3) {
            result.append(str.charAt(i + 1));
            result.append(str.charAt(i + 2));
            result.append(str.charAt(i));
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println(new oneTwo().oneTwo("chocolate"));
    }

}
