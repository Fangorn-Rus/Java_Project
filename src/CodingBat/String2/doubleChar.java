package CodingBat.String2;

public class doubleChar {
    //Given a string, return a string where for every char in the original, there are two chars.
    public String doubleChar(String str) {
            StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            sb.append(str.charAt(i));
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        System.out.println(new doubleChar().doubleChar("The"));
    }

}
