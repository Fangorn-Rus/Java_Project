package CodingBat.String2;

public class repeatSeparator {
    //Given two strings, word and a separator sep,
    // return a big string made of count occurrences of the word, separated by the separator string.
    public String repeatSeparator(String word, String sep, int count) {
        if (count == 0) return "";
        if (count == 1) return word;

        StringBuilder st1 = new StringBuilder(word);
        String sepPlusStr = new String(sep + word);

        for (int i = 0; i < count - 1; i++) {
            st1.append(sepPlusStr);
        }
        return String.valueOf(st1);
    }

    public static void main(String[] args) {
        System.out.println(new repeatSeparator().repeatSeparator("This", "And", 0));
    }

}
