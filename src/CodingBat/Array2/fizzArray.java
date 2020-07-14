package CodingBat.Array2;

public class fizzArray {
    /*
    Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
    The given n may be 0, in which case just return a length 0 array. You do not need a separate if-statement
    for the length-0 case; the for-loop should naturally execute 0 times in that case,
    so it just works. The syntax to make a new int array is: new int[desired_length]
     */
    public int[] fizzArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    public static void main(String[] args) {
        fizzArray fizz = new fizzArray();
        int [] array = fizz.fizzArray(5);
        for (int i : array) {
            System.out.print(i + " ,");
        }
    }

}
