package CodingBat.String3;

/*
Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive).
You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
 */
public class withoutString {
    public String withoutString(String base, String remove) {
        char[] array = base.toLowerCase().toCharArray();
        char[] arrayR = remove.toLowerCase().toCharArray();
        StringBuilder result = new StringBuilder();
        int arrayRLen = arrayR.length;

        OUTER:
        for (int i = 0; i < base.length(); i++) {
            if (array[i] != arrayR[0]) {
                result.append(base.charAt(i));
            } else {
                int count = 0;

                for (int j = 0; j < arrayRLen; j++) {
                    if (array[i + j] == arrayR[j]) count++;
                    else continue OUTER;
                }
                if (count == arrayRLen) i += arrayRLen - 1;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
//        System.out.println(new withoutString().withoutString("THIS is a FISH", "is"));
//        System.out.println(new withoutString().withoutString("AA22bb", "2"));
        System.out.println(new withoutString().withoutString("Hi HoHo", "Ho"));
    }

}
