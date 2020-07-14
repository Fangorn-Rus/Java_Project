package CodingBat.String2;

public class bobThere {
    //Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if ((str.charAt(i) == 'b') && (str.charAt(i + 2) == 'b')) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new bobThere().bobThere("abcb99b"));
    }
}
