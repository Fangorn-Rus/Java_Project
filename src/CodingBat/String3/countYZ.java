package CodingBat.String3;

/*
Given a string, count the number of words ending in 'y' or 'z' --
so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
We'll say that a y or z is at the end of a word if there
is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
 */
public class countYZ {
    public int countYZ(String str) {
        byte count = 0;
        char[] array = str.toLowerCase().toCharArray();
        int arrayLen = array.length;
        StringBuilder str1 = new StringBuilder();

        for (int i = 0; i < arrayLen; i++) {
            if (Character.isLetter(array[i])) {
                str1.append(array[i]);
                if (i == arrayLen - 1) {
                    if (str1.toString().endsWith("z") || str1.toString().endsWith("y")) { count++; }
                    break;
                }
            } else {
                if (str1.toString().endsWith("z") || str1.toString().endsWith("y")) count++;
                str1 = new StringBuilder();
            }

        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new countYZ().countYZ("day fez"));
        System.out.println(new countYZ().countYZ("day:yak"));
        System.out.println(new countYZ().countYZ("y2bz"));
    }

}
