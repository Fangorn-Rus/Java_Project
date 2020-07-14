package CodingBat.String2;

public class countHi {
    //Return the number of times that the string "hi" appears anywhere in the given string.
    public int countHi(String str) {
        int count = 0;
        if (str.length() > 1){
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') count++;
            }
            return count;
        }
        return count;

    }
}
