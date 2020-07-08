package CodingBat.String3;

/*
Given a string, return the length of the largest "block" in the string.
A block is a run of adjacent chars that are the same.
 */
public class maxBlock {
    public static int maxBlock(String str) {
        if (!str.isEmpty()) {
            int countResult = 1;
            int count = 1;
            char countChar = str.charAt(0);

            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == countChar) {
                    count++;
                    if (count > countResult) countResult = count;
                    countChar = str.charAt(i);
                } else {
                    count = 1;
                    countChar = str.charAt(i);
                }
            }
            return countResult;
        }
        return 0;


    }

    public static void main(String[] args) {
        System.out.println(maxBlock("hoopla"));// → 2
        System.out.println(maxBlock("abbCCCddBBBxx"));// → 3
        System.out.println(maxBlock(""));// → 0
        System.out.println(maxBlock("xyzz"));// → 2
    }

}
