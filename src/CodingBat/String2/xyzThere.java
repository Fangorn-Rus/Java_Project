package CodingBat.String2;

public class xyzThere {
    //Return true if the given string contains an appearance of "xyz"
    // where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

    public boolean xyzThere(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == '.') {
                if ((str.charAt(i + 1) == 'x') && (str.charAt(i + 2) == 'y') &&(str.charAt(i + 3)== 'z'));{
                    i ++;
                    continue;
                }
            }
            if (str.charAt(i) == 'x'){
                if ((str.charAt(i + 1) == 'y') &&(str.charAt(i + 2)== 'z')) count++;
            }
        }
        if (count > 0) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new xyzThere().xyzThere("abc.xyz"));
    }

}
