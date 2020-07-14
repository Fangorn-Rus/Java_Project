package CodingBat.String2;

public class zipZap {
    //Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z'
    // and ending with 'p'. Return a string where for all such words, the middle letter is gone,
    // so "zipXzap" yields "zpXzp".
    public String zipZap(String str) {
        StringBuilder result = new StringBuilder(str.length());
        if (str.length() < 3) return str;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'z'){
                if (str.charAt(i + 2) == 'p'){
                    result.append("zp");
                    i += 2;
                    continue;
                }
            }
            result.append(str.charAt(i));
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        System.out.println(new zipZap().zipZap(""));
    }

}
