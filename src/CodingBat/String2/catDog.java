package CodingBat.String2;

public class catDog {
    //Return true if the string "cat" and "dog" appear the same number of times in the given string.

    public boolean catDog(String str) {

            int countCat = 0;
            int countDog = 0;
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.charAt(i) == 'c'){
                    if (str.substring(i, i + 3).equals("cat")) countCat++;
                }
                else if (str.charAt(i) == 'd'){
                    if (str.substring(i, i + 3).equals("dog")) countDog++;
                }

            }
            if (countCat == countDog) return true;
            else return false;

    }

    public static void main(String[] args) {
        System.out.println(new catDog().catDog(""));
    }
}
