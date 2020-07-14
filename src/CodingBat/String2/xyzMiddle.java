package CodingBat.String2;

public class xyzMiddle {
    //Given a string, does "xyz" appear in the middle of the string? To define middle,
    // we'll say that the number of chars to the left and right of the "xyz"
    // must differ by at most one. This problem is harder than it looks.
    //НЕ СДЕЛАНО!
    public boolean xyzMiddle(String str) {
        String xyz = new String("xyz");
        if (str.contains(xyz)){
            int indexXyz = str.indexOf(xyz);
            int countZ = str.length() - (indexXyz + 3);

            if (indexXyz != 0 && (indexXyz + 3 != str.length()) &&
                    ((indexXyz + 1) == countZ || indexXyz == countZ || indexXyz == (countZ + 1))) return true;

        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(new xyzMiddle().xyzMiddle("xyz"));
    }

}
