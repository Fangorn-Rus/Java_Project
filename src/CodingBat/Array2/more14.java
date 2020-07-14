package CodingBat.Array2;

public class more14 {
    //Given an array of ints, return true if the number of 1's is greater than the number of 4's
    public boolean more14(int[] nums) {
        int countOne = 0;
        int countFour = 0;
        for (int i : nums) {
            switch (i){
                case 1:
                    countOne++;
                    break;
                case 4:
                    countFour++;
                    break;
            }
        }
        return countOne > countFour;
    }

    public static void main(String[] args) {
        System.out.println(new more14().more14(new int[] {1, 1}));
    }
}
