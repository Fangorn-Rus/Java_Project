package CodingBat.String3;
/*
We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
Return true if all the g's in the given string are happy.
 */
public class gHappy {
    public static boolean gHappy(String str) {
        int a = str.length();

        if(str.length() > 1){
            if (str.charAt(0) == 'g' && str.charAt(1) != 'g') return false;
            for (int i = 1; i < str.length() - 1; i++) {
                if(str.charAt(i) == 'g'){
                    if(str.charAt(i - 1) == 'g' || str.charAt(i + 1) == 'g') continue;
                    else return false;
                }
            }
            if (str.charAt(str.length() - 1) == 'g'){
                if (str.charAt(str.length() - 2) == 'g') return true;
                else return false;
            }

        }
        else if (str.length() == 1){
                if (str.charAt(0) == 'g') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(gHappy("xxggxx"));
        System.out.println(gHappy("xxgxx"));
        System.out.println(gHappy("xxggyygxx"));
    }

}
